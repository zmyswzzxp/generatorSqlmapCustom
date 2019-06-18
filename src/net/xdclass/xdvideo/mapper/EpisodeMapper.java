package net.xdclass.xdvideo.mapper;

import java.util.List;
import net.xdclass.xdvideo.domain.Episode;
import net.xdclass.xdvideo.domain.EpisodeExample;
import org.apache.ibatis.annotations.Param;

public interface EpisodeMapper {
    int countByExample(EpisodeExample example);

    int deleteByExample(EpisodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Episode record);

    int insertSelective(Episode record);

    List<Episode> selectByExample(EpisodeExample example);

    Episode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Episode record, @Param("example") EpisodeExample example);

    int updateByExample(@Param("record") Episode record, @Param("example") EpisodeExample example);

    int updateByPrimaryKeySelective(Episode record);

    int updateByPrimaryKey(Episode record);
}