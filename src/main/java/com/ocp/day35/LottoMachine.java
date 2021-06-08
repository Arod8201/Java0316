package com.ocp.day35;

import java.util.Random;
import java.util.concurrent.Callable;

public class LottoMachine implements Callable<Lotto> {

    private int num;

    public LottoMachine(int num) {
        this.num = num;
    }

    @Override
    public Lotto call() throws Exception {
        Random r = new Random();
        // 搖獎
        Thread.sleep(new Random().nextInt(3000));
        int lottoNumber = r.nextInt(39) + 1;
        // 取出(建立)彩球樂透
        Lotto lotto = new Lotto(num, lottoNumber, Thread.currentThread().getName());
        return lotto;
    }
}
