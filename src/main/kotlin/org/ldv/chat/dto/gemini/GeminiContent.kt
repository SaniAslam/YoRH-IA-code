package org.ldv.chat.dto.gemini

data class GeminiContent(
    val role: String,
    val parts: List<GeminiPart>
)
