package org.ldv.chat.dto.mistral

data class MistralChatResponse(
    val choices: List<MistralChoice>
)