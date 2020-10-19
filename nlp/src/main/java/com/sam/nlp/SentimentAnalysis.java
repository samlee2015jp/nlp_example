package com.sam.nlp;

import java.util.List;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class SentimentAnalysis {
    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipleline();

        // String text = "Hello, this is Sam. I don't know if I love the New York
        // city.";
        // String text = "Hello this is Sam. I don't love the New York city.";

        // String text = "Hello this is Sam. I really don't love the New York city.";

        String text = "Hello this is Sam. I really don't like the New York city.";

        CoreDocument coreDocument = new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> sentences = coreDocument.sentences();

        for (CoreSentence sentence : sentences) {

            String sentiment = sentence.sentiment();

            System.out.println(sentiment + "\t" + sentence);

        }

    }
}
