package org.ldv.chat.model.dao

import org.ldv.chat.model.entity.FournisseurIA
import org.springframework.data.jpa.repository.JpaRepository

interface FournisseurIADAO: JpaRepository<FournisseurIA, Long> {
}