package com.test.helloworld;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.test.helloworld.handlers.*;

public class MySkillStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new LaunchRequestHandler(),
                        new HelloWorldIntentHandler(),
                        new HelpIntentHandler(),
                        new CancelAndStopIntentHandler(),
                        new SessionEndedRequestHandler())
                .withSkillId("amzn1.ask.skill.1de31fee-85fb-4615-aead-fb8085a5a25c")
                .build();
    }

    public MySkillStreamHandler() {
        super(getSkill());
    }
}
