package org.ldv.chat.model.dao

import org.ldv.chat.model.entity.Conversation
import org.springframework.data.jpa.repository.JpaRepository

interface ConversationDAO : JpaRepository<Conversation, Long > {
    fun findAllByOrderByDateDerniereModificationDesc(): List<Conversation>
}