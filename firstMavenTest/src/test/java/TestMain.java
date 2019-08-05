public abstract class TestMain {
    IAnimal animal;

    public void testMain() {
        animal = getAnimal();

        voiceCheck();
    }
    public void voiceCheck() {

        char[] result = animal.voice().toCharArray();
        int countLow = 0;

        for (char a : result)
        {
            if (Character.isLowerCase(a))
                countLow++;
        }

            if (countLow > 0) {
                throw new RuntimeException("---Incorrect LowCase Voice---");
            }

//        catch (RuntimeException voi){
//            System.out.println(voi);
//        }

        if (result.length > 10) {
            throw new VoiceException(("---Array is bigger then 10 elements---"));
        }
    }
    abstract IAnimal getAnimal();
}
