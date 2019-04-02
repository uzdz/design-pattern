package com.uzdz.结构型模式.桥接模式.project.ext;

import com.uzdz.结构型模式.桥接模式.project.base.OriginTvCommand;
import com.uzdz.结构型模式.桥接模式.project.base.BaseTvController;

/**
 * 新式遥控器操作
 * @author uzdz
 * @date: 2019/4/2 15:12
 * @since 0.1.0
 */
public class NewTvController extends BaseTvController {

    boolean tvState = false;

    int channelNumber = 0;

    public NewTvController(OriginTvCommand controller) {
        super(controller);
    }

    @Override
    public void onOff() {
        if (tvState) {
            tvState = false;

            controller.off();
        } else {
            tvState = true;

            controller.on();
        }
    }

    @Override
    public void next() {
        channelNumber++;

        controller.setChannel(channelNumber);
    }

    @Override
    public void pre() {
        if (channelNumber == 0) {
            System.out.println("当前已经是第一个频道。");
            return;
        }

        channelNumber--;

        controller.setChannel(channelNumber);
    }
}
