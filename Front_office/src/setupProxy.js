const { createProxyMiddleware } = require('http-proxy-middleware');

module.exports = function(app) {
    app.use(
        '/contact',
        createProxyMiddleware({
            target: 'http://127.0.0.0:8080',
            changeOrigin: true,
        })
    );
};
