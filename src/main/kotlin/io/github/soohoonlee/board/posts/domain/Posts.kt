package io.github.soohoonlee.board.posts.domain

import javax.persistence.*

@Entity
class Posts(title: String, content: String, author: String) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(length = 500, nullable = false)
    var title: String = title

    @Column(columnDefinition = "TEXT", nullable = false)
    var content: String = content

    var author: String = author
}