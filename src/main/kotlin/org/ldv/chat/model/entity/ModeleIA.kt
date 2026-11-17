package org.ldv.chatbot.model.entity

import jakarta.persistence.*
import org.ldv.chat.model.entity.FournisseurIA

@Entity
class ModeleIA(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,
    @Column
    var nom: String,
    @Column
    var urlAPI: String,
    @Column
    var description: String,
    @Column
    var cheminLogo: String,
    @ManyToOne
    @JoinColumn(name= "id_fournisseur")
    var fournisseurIa: FournisseurIA
) {
}