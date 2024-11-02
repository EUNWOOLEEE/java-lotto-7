package lotto;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import java.util.ArrayList;

public class RandomPicker {
    public static ArrayList<Integer> pickLottoNumbers() {
        ArrayList<Integer> randomNumbers = new ArrayList<Integer>(Randoms.pickUniqueNumbersInRange(1, 45, 6));
        sortNumbers(randomNumbers);
        return randomNumbers;
    }

    private static void sortNumbers(ArrayList<Integer> randomNumbers) {
        randomNumbers.sort(null);
    }
}