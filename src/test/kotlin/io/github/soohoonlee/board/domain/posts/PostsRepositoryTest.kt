package io.github.soohoonlee.board.domain.posts

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor
import org.springframework.test.context.TestConstructor.AutowireMode.ALL

@SpringBootTest
@TestConstructor(autowireMode = ALL)
class PostsRepositoryTest(var postsRepository: PostsRepository) {

    @AfterEach
    internal fun tearDown() {
        postsRepository.deleteAll()
    }

    @DisplayName(value = "게시글저장_불러오기")
    @Test
    internal fun savePostsLoad() {
        // given
        val title = "테스트 게시글"
        val content = "테스트 본문"

        postsRepository.save(Posts(title, content, "soohoonlee1982@gmail.com"))

        // when
        val postsList = postsRepository.findAll()

        // then
        val posts = postsList[0]
        assertThat(posts.title).isEqualTo(title)
        assertThat(posts.content).isEqualTo(content)
    }
}