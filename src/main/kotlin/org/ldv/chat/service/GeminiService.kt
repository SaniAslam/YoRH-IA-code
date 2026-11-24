package org.ldv.chat.service
import org.ldv.chat.dto.gemini.*
import org.ldv.chat.model.entity.ModeleIA
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.client.RestClient

@Service
class GeminiService(
    private val restClientBuilder: RestClient.Builder,

    @Value("\${gemini.api.key}")
    private val apiKey: String

) : IAService {

    override fun getFournisseur(): String = "Gemini"

    override fun envoyerPrompt(prompt: String, modele: ModeleIA): String {

        // Étape 1 : Création du contenu utilisateur
        val contenu = GeminiContent(
            role = "user",
            parts = listOf(
                GeminiPart(text = prompt)
            )
        )

        // Étape 2 : Préparation de la requête Gemini
        val request = GeminiChatRequest(
            contents = listOf(contenu)
        )

        // Étape 3 : Envoi de la requête HTTP POST
        val client = restClientBuilder.build()

        val response = client.post()
            .uri("${modele.urlAPI}?key=$apiKey")
            .contentType(MediaType.APPLICATION_JSON)
            .body(request)
            .retrieve()
            .body(GeminiChatResponse::class.java)

        // Étape 4 : Récupération du texte de la réponse
        val reponse = response
            ?.candidates
            ?.firstOrNull()
            ?.content
            ?.parts
            ?.firstOrNull()
            ?.text

        return reponse ?: "Aucune réponse reçue de Gemini."
    }
}
