package com.madan.cli;

import com.madan.cli.service.CourseRetrieverService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CourseRetriever {
    private static final Logger LOG = LoggerFactory.getLogger(CourseRetriever.class);
    public static void main(String[] args) {
        LOG.info("Retriever Started ...");
       if(args.length == 0){
           LOG.info("Please provide the author name");
           return;
       }
       try {
           retrieveCourser(args[0]);
       } catch (Exception e){
           LOG.error("Unexpected Error");
           e.printStackTrace();
       }
    }

    private static void retrieveCourser(String authorName) {
        LOG.info("author name is {}",authorName);
        CourseRetrieverService courseRetrieverService = new CourseRetrieverService();
    }
}
