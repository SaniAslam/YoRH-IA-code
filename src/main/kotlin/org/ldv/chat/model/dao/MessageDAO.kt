package org.ldv.chat.model.dao

import org.ldv.chat.model.entity.Message
import org.springframework.data.jpa.repository.JpaRepository

interface MessageDAO : JpaRepository<Message, Long> {
}