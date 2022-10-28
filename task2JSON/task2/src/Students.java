public class Students {
    private String name;
    private String score;
    private String subject;

    public String getName()    {return name;}
    public String getScore()   {return score;}
    public String getSubject() {return subject;}
    
    Students(String nameSet, String scoreSet, String subjectSet) {
        name    = nameSet;
        score   = scoreSet;
        subject = subjectSet;
    }

    @Override
    public String toString() {
        return "Студент: " + name + " получил " + score + " по предмету " + subject;
    }
}
