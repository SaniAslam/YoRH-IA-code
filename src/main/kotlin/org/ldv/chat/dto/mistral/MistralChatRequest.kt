package org.ldv.chat.dto.mistral

data class MistralChatRequest(
    val model: String,
    val messages: List<MistralMessage>
)