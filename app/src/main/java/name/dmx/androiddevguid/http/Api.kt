package name.dmx.readhubclient.http

import io.reactivex.Observable
import name.dmx.androiddevguid.model.AppInfo
import name.dmx.androiddevguid.model.LibInfo
import name.dmx.readhubclient.model.News
import name.dmx.readhubclient.model.Topic
import retrofit2.http.*

/**
 * Created by dmx on 17-10-30.
 */
interface Api {
    /**
     * 热门话题
     */
    @GET("topic")
    fun getTopics(@Query("lastCursor") lastCursor: Long?, @Query("pageSize") pageSize: Int): Observable<PageResult<AppInfo>>

    /**
     * 科技动态
     */
    @GET("news")
    fun getNews(@Query("lastCursor") lastCursor: Long?, @Query("pageSize") pageSize: Int): Observable<PageResult<LibInfo>>

    /**
     * 开发者资讯
     */
    @GET("technews")
    fun getTechNews(@Query("lastCursor") lastCursor: Long?, @Query("pageSize") pageSize: Int): Observable<PageResult<LibInfo>>

}