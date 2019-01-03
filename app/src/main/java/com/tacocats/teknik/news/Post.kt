package com.tacocats.teknik.news

/**
 * Create a post.
 * @param title The post title
 * @param body The post body
 * @param date The date of the post
 */
class Post(private var title : String, private var body : String, private var date : String) {
    fun getPostTitle(): String {
        return this.title
    }

    fun getPostBody(): String {
        return this.body
    }

    fun getPostDate(): String {
        return this.date
    }
}