package com.sam.nlp;

import java.util.List;

import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.CoreSentence;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class SentenceRecognizer {
    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipleline();

        String text = "Hey! I am Sam Li. I am Software Developer and Consultant.";

        CoreDocument coreDocument = new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreSentence> sentences = coreDocument.sentences();

        for (CoreSentence coreSentence : sentences) {
            System.out.println(coreSentence.toString());
        }
    }
}
