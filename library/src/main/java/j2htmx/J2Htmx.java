/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package j2htmx;

import static j2html.TagCreator.script;
import j2html.attributes.Attribute;
import j2html.tags.ContainerTag;

/**
 *
 * @author tareq
 * A Class containing all functionalities of HTMX for usage with J2Html
 */
public class J2Htmx {

    private J2Htmx() {

    }

    private Attribute attribute(String key, String value) {
        return new Attribute(key, value);
    }

    /**
     * A Functional interface to generate attributes
     */
    public interface AttributeGenerator {

        /**
         * Generate the value of an attribute
         *
         * @return A String value for an attribute
         */
        public String generate();
    }

    public static J2Htmx hx = new J2Htmx();

    private final AttributeGenerator emptyAttributeGenerator = () -> null;

    private static class Constants {

        private static final String BOOST_ATTR_NAME = "hx-boost";
        private static final String GET_ATTR_NAME = "hx-get";
        private static final String POST_ATTR_NAME = "hx-post";
        private static final String PUSH_URL_ATTR_NAME = "hx-push-url";
        private static final String SELECT_ATTR_NAME = "hx-select";
        private static final String SELECT_OOB_ATTR_NAME = "hx-swap-oob";
        private static final String SWAP_ATTR_NAME = "hx-swap";
        private static final String SWAP_OOB_ATTR_NAME = "hx-swap-oob";
        private static final String TARGET_ATTR_NAME = "hx-target";
        private static final String TRIGGER_ATTR_NAME = "hx-trigger";
        private static final String VALS_ATTR_NAME = "hx-vals";
        private static final String CONFIRM_ATTR_NAME = "hx-confirm";
        private static final String DELETE_ATTR_NAME = "hx-delete";
        private static final String DISABLE_ATTR_NAME = "hx-disable";
        private static final String DISINHERIT_ATTR_NAME = "hx-disinherit";
        private static final String ENCODING_ATTR_NAME = "hx-encoding";
        private static final String EXT_ATTR_NAME = "hx-ext";
        private static final String HEADERS_ATTR_NAME = "hx-headers";
        private static final String HISTORY_ELT_ATTR_NAME = "hx-history-elt";
        private static final String INCLUDE_ATTR_NAME = "hx-include";
        private static final String INDICATOR_ATTR_NAME = "hx-indicator";
        private static final String PARAMS_ATTR_NAME = "hx-params";
        private static final String PATCH_ATTR_NAME = "hx-patch";
        private static final String PRESERVE_ATTR_NAME = "hx-preserve";
        private static final String PROMPT_ATTR_NAME = "hx-prompt";
        private static final String PUT_ATTR_NAME = "hx-put";
        private static final String REPLACE_URL_ATTR_NAME = "hx-replace-url";
        private static final String REQUEST_ATTR_NAME = "hx-request-attr";
        private static final String SSE_ATTR_NAME = "hx-sse";
        private static final String SYNC_ATTR_NAME = "hx-sync";
        private static final String VARS_ATTR_NAME = "hx-vars";
        private static final String WS_ATTR_NAME = "hx-ws";
        private static final String HTMX_SRC = "https://unpkg.com/htmx.org@1.8.0";
        private static final String HTMX_INTEGRITY = "sha384-cZuAZ+ZbwkNRnrKi05G/fjBX+azI9DNOkNYysZ0I/X5ZFgsmMiBXgDZof30F5ofc";
        private static final String HTMX_CROSSORIGIN = "anonymous";
        private static final String HYPERSCRIPT_SRC = "https://unpkg.com/hyperscript.org@0.9.7";
        private static final String HYPERSCRIPT_ATTR_NAME = "_";

    }

    public static class Headers {

        public static final String REQUEST = "HX-Request";
        public static final String TRIGGER = "HX-Trigger";
        public static final String TRIGGER_NAME = "HX-Trigger-Name";
        public static final String TARGET = "HX-Target";
        public static final String PROMPT = "HX-Prompt";
        public static final String PUSH = "HX-Push";
        public static final String REDIRECT = "HX-Redirect";
        public static final String REFRESH = "HX-Refresh";
        public static final String TRIGGER_AFTER_SWAP = "HX-Trigger-After-Swap";
        public static final String TRIGGER_AFTER_SETTLE = "HX-Trigger-After-Settle";
    }

    /**
     * Injects htmx script imports into a container tag
     *
     * @param tag
     * @return
     */
    public static ContainerTag withHtmxImport(ContainerTag tag) {
        return tag.with(script().withSrc(Constants.HTMX_SRC)
                .attr("integrity", Constants.HTMX_INTEGRITY)
                .attr("crossorigin", Constants.HTMX_CROSSORIGIN));
    }

    /**
     * Injects hyperscript script imports into a container tag
     *
     * @param tag
     * @return
     */
    public static ContainerTag withHyperscriptImport(ContainerTag tag) {
        return tag.with(script().withSrc(Constants.HYPERSCRIPT_SRC));
    }

    public Attribute boost(String value) {
        return attribute(Constants.BOOST_ATTR_NAME, value);
    }

    public Attribute boost() {
        return boost(emptyAttributeGenerator);
    }

    public Attribute boost(AttributeGenerator generator) {
        return boost(generator.generate());
    }

    public Attribute get(String value) {
        return attribute(Constants.GET_ATTR_NAME, value);
    }

    public Attribute get() {
        return get(emptyAttributeGenerator);
    }

    public Attribute get(AttributeGenerator generator) {
        return get(generator.generate());
    }

    public Attribute post(String value) {
        return attribute(Constants.POST_ATTR_NAME, value);
    }

    public Attribute post() {
        return post(emptyAttributeGenerator);
    }

    public Attribute post(AttributeGenerator generator) {
        return post(generator.generate());
    }

    public Attribute pushUrl(String value) {
        return attribute(Constants.PUSH_URL_ATTR_NAME, value);
    }

    public Attribute pushUrl() {
        return pushUrl(emptyAttributeGenerator);
    }

    public Attribute pushUrl(AttributeGenerator generator) {
        return pushUrl(generator.generate());
    }

    public Attribute select(String value) {
        return attribute(Constants.SELECT_ATTR_NAME, value);
    }

    public Attribute select() {
        return select(emptyAttributeGenerator);
    }

    public Attribute select(AttributeGenerator generator) {
        return select(generator.generate());
    }

    public Attribute selectOob(String value) {
        return attribute(Constants.SELECT_OOB_ATTR_NAME, value);
    }

    public Attribute selectOob() {
        return selectOob(emptyAttributeGenerator);
    }

    public Attribute selectOob(AttributeGenerator generator) {
        return selectOob(generator.generate());
    }

    public Attribute swap(String value) {
        return attribute(Constants.SWAP_ATTR_NAME, value);
    }

    public Attribute swap() {
        return swap(emptyAttributeGenerator);
    }

    public Attribute swap(AttributeGenerator generator) {
        return swap(generator.generate());
    }

    public Attribute swapOob(String value) {
        return attribute(Constants.SWAP_OOB_ATTR_NAME, value);
    }

    public Attribute swapOob() {
        return swapOob(emptyAttributeGenerator);
    }

    public Attribute swapOob(AttributeGenerator generator) {
        return swapOob(generator.generate());
    }

    public Attribute target(String value) {
        return attribute(Constants.TARGET_ATTR_NAME, value);
    }

    public Attribute target() {
        return target(emptyAttributeGenerator);
    }

    public Attribute target(AttributeGenerator generator) {
        return target(generator.generate());
    }

    public Attribute trigger(String value) {
        return attribute(Constants.TRIGGER_ATTR_NAME, value);
    }

    public Attribute trigger() {
        return trigger(emptyAttributeGenerator);
    }

    public Attribute trigger(AttributeGenerator generator) {
        return trigger(generator.generate());
    }

    public Attribute vals(String value) {
        return attribute(Constants.VALS_ATTR_NAME, value);
    }

    public Attribute vals() {
        return vals(emptyAttributeGenerator);
    }

    public Attribute vals(AttributeGenerator generator) {
        return vals(generator.generate());
    }

    public Attribute confirm(String value) {
        return attribute(Constants.CONFIRM_ATTR_NAME, value);
    }

    public Attribute confirm() {
        return confirm(emptyAttributeGenerator);
    }

    public Attribute confirm(AttributeGenerator generator) {
        return confirm(generator.generate());
    }

    public Attribute delete(String value) {
        return attribute(Constants.DELETE_ATTR_NAME, value);
    }

    public Attribute delete() {
        return delete(emptyAttributeGenerator);
    }

    public Attribute delete(AttributeGenerator generator) {
        return delete(generator.generate());
    }

    public Attribute disable(String value) {
        return attribute(Constants.DISABLE_ATTR_NAME, value);
    }

    public Attribute disable() {
        return disable(emptyAttributeGenerator);
    }

    public Attribute disable(AttributeGenerator generator) {
        return disable(generator.generate());
    }

    public Attribute disinherit(String value) {
        return attribute(Constants.DISINHERIT_ATTR_NAME, value);
    }

    public Attribute disinherit() {
        return disinherit(emptyAttributeGenerator);
    }

    public Attribute disinherit(AttributeGenerator generator) {
        return disinherit(generator.generate());
    }

    public Attribute encoding(String value) {
        return attribute(Constants.ENCODING_ATTR_NAME, value);
    }

    public Attribute encoding() {
        return encoding(emptyAttributeGenerator);
    }

    public Attribute encoding(AttributeGenerator generator) {
        return encoding(generator.generate());
    }

    public Attribute ext(String value) {
        return attribute(Constants.EXT_ATTR_NAME, value);
    }

    public Attribute ext() {
        return ext(emptyAttributeGenerator);
    }

    public Attribute ext(AttributeGenerator generator) {
        return ext(generator.generate());
    }

    public Attribute headers(String value) {
        return attribute(Constants.HEADERS_ATTR_NAME, value);
    }

    public Attribute headers() {
        return headers(emptyAttributeGenerator);
    }

    public Attribute headers(AttributeGenerator generator) {
        return headers(generator.generate());
    }

    public Attribute historyElt(String value) {
        return attribute(Constants.HISTORY_ELT_ATTR_NAME, value);
    }

    public Attribute historyElt() {
        return historyElt(emptyAttributeGenerator);
    }

    public Attribute historyElt(AttributeGenerator generator) {
        return historyElt(generator.generate());
    }

    public Attribute include(String value) {
        return attribute(Constants.INCLUDE_ATTR_NAME, value);
    }

    public Attribute include() {
        return include(emptyAttributeGenerator);
    }

    public Attribute include(AttributeGenerator generator) {
        return include(generator.generate());
    }

    public Attribute indicator(String value) {
        return attribute(Constants.INDICATOR_ATTR_NAME, value);
    }

    public Attribute indicator() {
        return indicator(emptyAttributeGenerator);
    }

    public Attribute indicator(AttributeGenerator generator) {
        return indicator(generator.generate());
    }

    public Attribute params(String value) {
        return attribute(Constants.PARAMS_ATTR_NAME, value);
    }

    public Attribute params() {
        return params(emptyAttributeGenerator);
    }

    public Attribute params(AttributeGenerator generator) {
        return params(generator.generate());
    }

    public Attribute patch(String value) {
        return attribute(Constants.PATCH_ATTR_NAME, value);
    }

    public Attribute patch() {
        return patch(emptyAttributeGenerator);
    }

    public Attribute patch(AttributeGenerator generator) {
        return patch(generator.generate());
    }

    public Attribute preserve(String value) {
        return attribute(Constants.PRESERVE_ATTR_NAME, value);
    }

    public Attribute preserve() {
        return preserve(emptyAttributeGenerator);
    }

    public Attribute preserve(AttributeGenerator generator) {
        return preserve(generator.generate());
    }

    public Attribute prompt(String value) {
        return attribute(Constants.PROMPT_ATTR_NAME, value);
    }

    public Attribute prompt() {
        return prompt(emptyAttributeGenerator);
    }

    public Attribute prompt(AttributeGenerator generator) {
        return prompt(generator.generate());
    }

    public Attribute put(String value) {
        return attribute(Constants.PUT_ATTR_NAME, value);
    }

    public Attribute put() {
        return put(emptyAttributeGenerator);
    }

    public Attribute put(AttributeGenerator generator) {
        return put(generator.generate());
    }

    public Attribute replaceUrl(String value) {
        return attribute(Constants.REPLACE_URL_ATTR_NAME, value);
    }

    public Attribute replaceUrl() {
        return replaceUrl(emptyAttributeGenerator);
    }

    public Attribute replaceUrl(AttributeGenerator generator) {
        return replaceUrl(generator.generate());
    }

    public Attribute request(String value) {
        return attribute(Constants.REQUEST_ATTR_NAME, value);
    }

    public Attribute request() {
        return request(emptyAttributeGenerator);
    }

    public Attribute request(AttributeGenerator generator) {
        return request(generator.generate());
    }

    public Attribute sse(String value) {
        return attribute(Constants.SSE_ATTR_NAME, value);
    }

    public Attribute sse() {
        return sse(emptyAttributeGenerator);
    }

    public Attribute sse(AttributeGenerator generator) {
        return sse(generator.generate());
    }

    public Attribute sync(String value) {
        return attribute(Constants.SYNC_ATTR_NAME, value);
    }

    public Attribute sync() {
        return sync(emptyAttributeGenerator);
    }

    public Attribute sync(AttributeGenerator generator) {
        return sync(generator.generate());
    }

    public Attribute vars(String value) {
        return attribute(Constants.VARS_ATTR_NAME, value);
    }

    public Attribute vars() {
        return vars(emptyAttributeGenerator);
    }

    public Attribute vars(AttributeGenerator generator) {
        return vars(generator.generate());
    }

    public Attribute ws(String value) {
        return attribute(Constants.WS_ATTR_NAME, value);
    }

    public Attribute ws() {
        return ws(emptyAttributeGenerator);
    }

    public Attribute ws(AttributeGenerator generator) {
        return ws(generator.generate());
    }

    public Attribute hyperscript() {
        return hyperscript(emptyAttributeGenerator);
    }

    public Attribute hyperscript(String value) {
        return attribute(Constants.HYPERSCRIPT_ATTR_NAME, value);
    }

    public Attribute hyperscript(AttributeGenerator generator) {
        return hyperscript(generator.generate());
    }

}
