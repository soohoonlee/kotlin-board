package io.github.soohoonlee.board.posts.domain

import org.springframework.data.jpa.repository.JpaRepository

interface PostsRepository : JpaRepository<Posts, Long> {
}