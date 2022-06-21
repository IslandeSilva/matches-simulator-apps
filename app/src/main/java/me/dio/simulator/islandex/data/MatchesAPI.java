package me.dio.simulator.islandex.data;


import java.util.List;

import me.dio.simulator.islandex.domain.Match;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesAPI {
   @GET("matches.json")
   Call<List<Match>> getMaches();
}
