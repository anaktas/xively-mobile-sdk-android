package com.xively.internal.rest.blueprint;

import com.xively.internal.rest.blueprint.accountUserQuery.AccountUsersList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetAccountUser {

    @GET("/api/v1/account-users")
    Call<Response> getAccountUser(
            @Query("accountId") String accountId,
            @Query("userId") String accessUserId,
            @Query("meta") Boolean meta,
            @Query("results") Boolean results,
            @Query("page") Integer page,
            @Query("pageSize") Integer pageSize,
            @Query("sortOrder") String sortOrder
    );

    class Response {
        public AccountUsersList accountUsers;
        public BlueprintError error;
    }
}
