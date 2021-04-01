package io.github.soohoonlee.board.posts.web.dto

import io.github.soohoonlee.board.posts.domain.Posts

data class PostsSaveRequestDto(
    val title: String,
    val content: String,
    val author: String
) {
    fun toEntity() : Posts {
        return Posts(title, content, author)
    }
}

