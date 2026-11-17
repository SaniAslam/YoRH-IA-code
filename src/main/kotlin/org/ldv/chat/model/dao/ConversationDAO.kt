package org.ldv.chat.model.dao

import org.springframework.data.jpa.repository.JpaRepository

interface ConversationDAO : JpaRepository<ConversationDAO, Long> {
}