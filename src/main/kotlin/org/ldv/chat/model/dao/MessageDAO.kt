package org.ldv.chat.model.dao

import org.ldv.chat.model.entity.Message
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.transaction.annotation.Transactional
interface MessageDAO : JpaRepository<Message, Long> {
    fun deleteAllByConversation_Id(conversationId: Long)

}
