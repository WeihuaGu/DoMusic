package com.dirror.music.api
import com.dirror.music.manager.User

/**
 * 网易云官方 api
 */
const val API_NETEASE = "https://music.163.com/api"

@JvmField
const val API_FROMUSER = User.neteaseCloudMusicApi

/**
 * Dso Music 默认 API
 */
const val API_DEFAULT = "https://cloudmusic.moriafly.xyz"

/**
 * Dso Music 备用接口
 */

@JvmField
const val API_DSO = API_FROMUSER
@JvmField
const val API_MUSIC_API = API_FROMUSER
@JvmField
const val API_FCZBL_VIP = API_FROMUSER
@JvmField
const val API_IMJAD = API_FROMUSER

@JvmField
const val API_MUSIC_ELEUU = API_FROMUSER

@JvmField
const val API_AUTU = API_FROMUSER

@JvmField
const val API_LOGIN = API_AUTU



