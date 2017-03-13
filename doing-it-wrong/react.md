# 2017

* March
  * Before passing an event callback function as an attribute, you need to `cb.bind(this)`. See [this snippet](http://codepen.io/gaearon/pen/xEmzGg?editors=0010) from [the official documentation](https://facebook.github.io/react/docs/handling-events.html).
  * Don't forget to `import React from 'react'` when using JSX syntax. JSX is [just syntax sugar](https://facebook.github.io/react/docs/jsx-in-depth.html) for `React.createElement(...)`.