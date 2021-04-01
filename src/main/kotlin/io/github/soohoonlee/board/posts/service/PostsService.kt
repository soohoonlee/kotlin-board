package io.github.soohoonlee.board.posts.service

import io.github.soohoonlee.board.posts.domain.PostsRepository
import io.github.soohoonlee.board.posts.web.dto.PostsSaveRequestDto
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class PostsService(private val postsRepository: PostsRepository) {

    @Transactional
    fun save(requestDto: PostsSaveRequestDto): Long? {
        return postsRepository.save(requestDto.toEntity()).id
    }
}
