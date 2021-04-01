package io.github.soohoonlee.board.posts.web

import io.github.soohoonlee.board.posts.service.PostsService
import io.github.soohoonlee.board.posts.web.dto.PostsSaveRequestDto
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/api/v1/posts"])
class PostsApiController(var postsService: PostsService) {

    @PostMapping
    fun save(@RequestBody requestDto: PostsSaveRequestDto): Long? {
        return postsService.save(requestDto)
    }
}