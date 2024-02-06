package behavioral.command.version1.impl;

import behavioral.command.version1.AbstractCommand;
import behavioral.command.version1.Barbecue;

/**
 *
 * 烤羊肉串命令类
 *
 * @author nisang
 * 2024/2/6 13:36
 * @version 1.0
 * Ruoyi-Cloud-Plus开发小组
 */
public class BakeMuttonCommand extends AbstractCommand {

    public BakeMuttonCommand(Barbecue receiver) {
        super(receiver);
    }

    @Override
    public void executeCommand() {
        receiver.bakeMutton();
    }
}
