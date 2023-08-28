package com.wonnapark.wnpserver.domain.episode.application;

import com.wonnapark.wnpserver.domain.episode.dto.request.EpisodeArtistCommentUpdateRequest;
import com.wonnapark.wnpserver.domain.episode.dto.request.EpisodeCreationRequest;
import com.wonnapark.wnpserver.domain.episode.dto.request.EpisodeReleaseDateTimeUpdateRequest;
import com.wonnapark.wnpserver.domain.episode.dto.request.EpisodeThumbnailUpdateRequest;
import com.wonnapark.wnpserver.domain.episode.dto.request.EpisodeTitleUpdateRequest;
import com.wonnapark.wnpserver.domain.episode.dto.request.EpisodeUrlsUpdateRequest;

public interface EpisodeManage {

    Long createEpisode(Long webtoonId, EpisodeCreationRequest request);

    void updateEpisodeTitle(Long episodeId, EpisodeTitleUpdateRequest request);

    void updateEpisodeArtistComment(Long episodeId, EpisodeArtistCommentUpdateRequest request);

    void updateEpisodeThumbnail(Long episodeId, EpisodeThumbnailUpdateRequest request);

    void updateEpisodeReleaseDateTime(Long episodeId, EpisodeReleaseDateTimeUpdateRequest request);

    void updateEpisodeUrls(Long episodeId, EpisodeUrlsUpdateRequest request);

    void deleteEpisode(Long episodeId);

}
