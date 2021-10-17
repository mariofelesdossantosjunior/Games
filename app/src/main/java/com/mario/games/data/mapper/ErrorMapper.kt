package com.mario.games.data.mapper

import android.util.Log
import com.mario.games.domain.entity.base.ErrorRecord
import com.mario.games.domain.entity.base.Record
import com.mario.games.remote.RemoteException

class ErrorMapper {

    fun <T> mapErrorRecord(error: RemoteException): Record<T> {
        Log.e(ErrorMapper::class.simpleName, error.message.toString())
        val errorRecord: ErrorRecord = when (error) {
            is RemoteException.ClientError -> ErrorRecord.ClientError
            is RemoteException.ServerError -> ErrorRecord.ServerError
            is RemoteException.NoNetworkError -> ErrorRecord.NetworkError
            else -> ErrorRecord.GenericError
        }
        return Record(null, errorRecord)
    }
}