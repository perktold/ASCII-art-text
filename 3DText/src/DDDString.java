public class DDDString {
    Letter[] letters;
    DDDString(String content){
        letters = new Letter[content.length()];
        for(int i = 0; i < content.length(); i++){
            letters[i] = new Letter(content.toCharArray()[i]);
        }
    }
    public void print(){
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < letters.length; j++) {
                letters[j].print(i);
            }
            System.out.println();
        }
    }
}
