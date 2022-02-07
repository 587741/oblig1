package com.example.mythirdtry;

public class Questions {
    //Getter
    public String getQuestions(int q) {
        String questions = mQuestions[q];
        return questions;
    }

    public String[] getChoice(int q) {
        String [] choice = mChoice[q];
        return choice;
    }

    public String getImages(int q) {
        String img = mImages[q];
        return img;
    }

    public String getType(int q) {
        String type = mQuestionsType[q];
        return type;
    }

    public int getLength(){
        return mQuestions.length;
    }
    public String getCorrectAnswer(int q) {
        String correct = mCorrectAnswer[q];
        return correct;
    }

    private String mQuestions [] = {

            // Spørsmål
            "Hvilket dyr er dette?",
            "Hvilket dyr er dette?",
            "Hvilket dyr er dette?",
            "Hvilket dyr er dette?",
            "Hvilket dyr er dette?",

            "Hvilket dyr er dette?",
            "Hvilket dyr er dette?",
            "Hvilket dyr er dette?",
            "Hvilket dyr er dette?",
            "Hvilket dyr er dette?"
    };

    private String mChoice [][] = {
            // Valg
            {"Ku" ,"Hest" ,"Slange"},
            {"Gorilla" ,"Sau" ,"Struts"},
            {"Nesehorn" ,"Hest" ,"Gris"},
            {"Struts" ,"Hest" ,"Slange"},
            {"Giraff" ,"Panda" ,"Leopard"},
            {"Slange" ,"Ku" ,"Nesehorn"},
            {"Struts" ,"Gorilla" ,"Sau"},
            {"Hest" ,"Panda" ,"Gris"},
            {"Leopard" ,"Ku" ,"Slange"},
            {"Ku" ,"Nesehorn" ,"Gorilla"},

    };

    private String mImages [] = {
            // Bilder
            "q1", // Ku bildet
            "q2", // Sau bildet
            "q3", // Gris bildet
            "q4", // Hest bildet
            "q5", // Giraff bildet
            "q6", // Nesehorn bildet
            "q7", // Struts bildet
            "q8", // Panda bildet
            "q9", // Leopard bildet
            "q10", // Gorilla bildet
    };

    private String mQuestionsType [] = {
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",
            "radiobutton",

    };

    private String mCorrectAnswer [] = {
            // rett svar
            "Ku",
            "Sau",
            "Gris",
            "Hest",
            "Giraff",
            "Nesehorn",
            "Struts",
            "Panda",
            "Leopard",
            "Gorilla",
    };
}
