package cn.jackuxl.qforum.model

data class Comment(var id:Int?,var postTime:String?,var up:Boolean = false,var publisherId:Int?,var content:String?,var threadId:Int?) {
    constructor() : this(null,null,false,null,null,null) {
    }
}