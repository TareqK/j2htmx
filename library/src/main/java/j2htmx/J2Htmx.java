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
 */
public class J2Htmx {

    private J2Htmx() {

    }

    public static J2Htmx hx = new J2Htmx();

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

    private Attribute attribute(String key, String value) {
        return new Attribute(key, value);
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
        return boost(null);
    }

    public Attribute get(String value) {
        return attribute(Constants.GET_ATTR_NAME, value);
    }

    public Attribute get() {
        return get(null);
    }

    public Attribute post(String value) {
        return attribute(Constants.POST_ATTR_NAME, value);
    }

    public Attribute post() {
        return post(null);
    }

    public Attribute pushUrl(String value) {
        return attribute(Constants.PUSH_URL_ATTR_NAME, value);
    }

    public Attribute pushUrl() {
        return pushUrl(null);
    }

    public Attribute select(String value) {
        return attribute(Constants.SELECT_ATTR_NAME, value);
    }

    public Attribute select() {
        return select(null);
    }

    public Attribute selectOob(String value) {
        return attribute(Constants.SELECT_OOB_ATTR_NAME, value);
    }

    public Attribute selectOob() {
        return selectOob(null);
    }

    public Attribute swap(String value) {
        return attribute(Constants.SWAP_ATTR_NAME, value);
    }

    public Attribute swap() {
        return swap(null);
    }

    public Attribute swapOob(String value) {
        return attribute(Constants.SWAP_OOB_ATTR_NAME, value);
    }

    public Attribute swapOob() {
        return swapOob(null);
    }

    public Attribute target(String value) {
        return attribute(Constants.TARGET_ATTR_NAME, value);
    }

    public Attribute target() {
        return target(null);
    }

    public Attribute trigger(String value) {
        return attribute(Constants.TRIGGER_ATTR_NAME, value);
    }

    public Attribute trigger() {
        return trigger(null);
    }

    public Attribute vals(String value) {
        return attribute(Constants.VALS_ATTR_NAME, value);
    }

    public Attribute vals() {
        return vals(null);
    }

    public Attribute confirm(String value) {
        return attribute(Constants.CONFIRM_ATTR_NAME, value);
    }

    public Attribute confirm() {
        return confirm(null);
    }

    public Attribute delete(String value) {
        return attribute(Constants.DELETE_ATTR_NAME, value);
    }

    public Attribute delete() {
        return delete(null);
    }

    public Attribute disable(String value) {
        return attribute(Constants.DISABLE_ATTR_NAME, value);
    }

    public Attribute disable() {
        return disable(null);
    }

    public Attribute disinherit(String value) {
        return attribute(Constants.DISINHERIT_ATTR_NAME, value);
    }

    public Attribute disinherit() {
        return disinherit(null);
    }

    public Attribute encoding(String value) {
        return attribute(Constants.ENCODING_ATTR_NAME, value);
    }

    public Attribute encoding() {
        return encoding(null);
    }

    public Attribute ext(String value) {
        return attribute(Constants.EXT_ATTR_NAME, value);
    }

    public Attribute ext() {
        return ext(null);
    }

    public Attribute headers(String value) {
        return attribute(Constants.HEADERS_ATTR_NAME, value);
    }

    public Attribute headers() {
        return headers(null);
    }

    public Attribute historyElt(String value) {
        return attribute(Constants.HISTORY_ELT_ATTR_NAME, value);
    }

    public Attribute historyElt() {
        return historyElt(null);
    }

    public Attribute include(String value) {
        return attribute(Constants.INCLUDE_ATTR_NAME, value);
    }

    public Attribute include() {
        return include(null);
    }

    public Attribute indicator(String value) {
        return attribute(Constants.INDICATOR_ATTR_NAME, value);
    }

    public Attribute indicator() {
        return indicator(null);
    }

    public Attribute params(String value) {
        return attribute(Constants.PARAMS_ATTR_NAME, value);
    }

    public Attribute params() {
        return params(null);
    }

    public Attribute patch(String value) {
        return attribute(Constants.PATCH_ATTR_NAME, value);
    }

    public Attribute patch() {
        return patch(null);
    }

    public Attribute preserve(String value) {
        return attribute(Constants.PRESERVE_ATTR_NAME, value);
    }

    public Attribute preserve() {
        return preserve(null);
    }

    public Attribute prompt(String value) {
        return attribute(Constants.PROMPT_ATTR_NAME, value);
    }

    public Attribute prompt() {
        return prompt(null);
    }

    public Attribute put(String value) {
        return attribute(Constants.PUT_ATTR_NAME, value);
    }

    public Attribute put() {
        return put(null);
    }

    public Attribute replaceUrl(String value) {
        return attribute(Constants.REPLACE_URL_ATTR_NAME, value);
    }

    public Attribute replaceUrl() {
        return replaceUrl(null);
    }

    public Attribute request(String value) {
        return attribute(Constants.REQUEST_ATTR_NAME, value);
    }

    public Attribute request() {
        return request(null);
    }

    public Attribute sse(String value) {
        return attribute(Constants.SSE_ATTR_NAME, value);
    }

    public Attribute sse() {
        return sse(null);
    }

    public Attribute sync(String value) {
        return attribute(Constants.SYNC_ATTR_NAME, value);
    }

    public Attribute sync() {
        return sync(null);
    }

    public Attribute vars(String value) {
        return attribute(Constants.VARS_ATTR_NAME, value);
    }

    public Attribute vars() {
        return vars(null);
    }

    public Attribute ws(String value) {
        return attribute(Constants.WS_ATTR_NAME, value);
    }

    public Attribute ws() {
        return ws(null);
    }

    public Attribute hyperscript() {
        return hyperscript(() -> null);
    }

    public Attribute hyperscript(String value) {
        return attribute(Constants.HYPERSCRIPT_ATTR_NAME, value);
    }

    public Attribute hyperscript(HyperscriptGenerator generator) {
        return hyperscript(generator.generate());
    }

    /**
     * A Functional interface to generate hyperscript scripts
     */
    public interface HyperscriptGenerator {

        public String generate();
    }

}
