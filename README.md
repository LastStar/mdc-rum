# mdc-rum

A [ClojureScript][cljs] library designed for use of the
[Material Design Components for Web][mdcw] in [Rum][rum] based
[ClojureScript][cljs] applications.

Not complete, just what I needed so far. Feel free to PR some more.

## Usage

Add to dependencies: `[laststar/mdc-rum "0.1.0-SNAPSHOT"]`.

For css styles you need to add link to [MDC][mdcw] styles:

```
<link rel="stylesheet" href="cljsjs/material-components/production/material-components.min.inc.css">
```

to your `index.hml`.

### Namespaces

`mdc-rum.core` namespace contains keyword constants for hiccup style MDC
elements:

```clojure
(require '[mdc-rum.core :as mdc])

[mdc/icon "face"] ;; <span class="material-icons">face</span>`
```

`mdc-rum.components` namespace contains [Rum][rum] components:

```clojure

(require '[mdc-rum.components :as mdcc])

[mdcc/button {:some :options} "Label"] 

```

`mdc-rum.mixins` namespace contains [MDC][mdcw] mixins, used mostly internally
by the components.

## Discussion

I definitely know about other libraries, which solve similar problem like
[rum-mdc][rumm]. But I am not sure I need to create [Rum][rum] component for
every element and reimplement all the [MDC][mdcw] JavaScript myself.

Still probably these other libraries are better for you :-).

## License

Copyright © 2017 LastStar.eu

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.


[cljs]: https://https://github.com/clojure/clojurescript
[mdcw]: https://github.com/material-components/material-components-web
[rum]: https://github.com/tonsky/rum
[rumm]: https://github.com/roman0/rum-mdc
