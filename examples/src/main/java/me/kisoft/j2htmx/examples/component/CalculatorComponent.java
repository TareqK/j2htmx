package me.kisoft.j2htmx.examples.component;

import io.javalin.http.Context;
import static j2html.TagCreator.button;
import static j2html.TagCreator.div;
import static j2html.TagCreator.form;
import static j2html.TagCreator.h2;
import static j2html.TagCreator.input;
import static j2html.TagCreator.option;
import static j2html.TagCreator.select;
import j2html.tags.Tag;
import static j2htmx.J2Htmx.hx;
import org.apache.commons.lang3.RandomStringUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tareq
 */
public class CalculatorComponent extends Component {

    @Override
    protected String render(Context ctx) {
        double operand1 = ctx.formParamAsClass("op1", Double.class).get();
        double operand2 = ctx.formParamAsClass("op2", Double.class).get();
        String operation = ctx.formParamAsClass("operation", String.class).get();

        double result = 0;

        switch (operation) {
            case "ADDITION":
                result = operand1 + operand2;
                break;
            case "SUBTRACTION":
                result = operand1 - operand2;
                break;
            default:
                result = 0;
                break;
        }

        return h2(String.format("Your result is %s", String.valueOf(result))).render();
    }

    public static String rootPath() {
        return "/calculator";
    }

    public static Tag calculator() {
        String randomId = RandomStringUtils.randomAlphabetic(15);
        return div(
                div().withId(randomId),
                form(
                        input().withName("op1").withType("number"),
                        select(
                                option("+").withValue("ADDITION"),
                                option("-").withValue("SUBTRACTION")
                        ).withName("operation"),
                        input().withName("op2").withType("number"),
                        button("go").withType("submit")
                ).attr(hx.post(rootPath())))
                .attr(hx.target("#" + randomId)
                );
    }

}
