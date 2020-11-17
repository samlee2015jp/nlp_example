package com.sam.nlp;

import java.util.List;

import edu.stanford.nlp.ling.CoreAnnotations;
import edu.stanford.nlp.ling.CoreLabel;
import edu.stanford.nlp.pipeline.CoreDocument;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class NerExample {
    public static void main(String[] args) {
        StanfordCoreNLP stanfordCoreNLP = Pipeline.getPipleline();

        String text = "Hey! My name is Sam Li and I have a friend who's name is Robert."
                + " We both are living in Tokyo Japan.";

        CoreDocument coreDocument = new CoreDocument(text);

        stanfordCoreNLP.annotate(coreDocument);

        List<CoreLabel> coreLabels = coreDocument.tokens();

        for (CoreLabel coreLabel : coreLabels) {

            String ner = coreLabel.get(CoreAnnotations.NamedEntityTagAnnotation.class);

            // System.out.println(coreLabel.originalText() + " = " + ner);
            if ("O".equals(ner)) {
                System.out.println(ner);
            } else {
                System.out.println(coreLabel.originalText() + " = " + ner);
            }
        }

    }
}
