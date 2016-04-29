cordova.define('cordova/plugin_list', function(require, exports, module) {
module.exports = [
    {
        "file": "barcodescanner.js",
        "id": "com.example.qrcode.BarcodeScanner",
        "clobbers": [
            "cordova.plugins.barcodeScanner"
        ]
    }
];
module.exports.metadata = 
// TOP OF METADATA
{
    "com.example.qrcode": "1.0.1"
}
// BOTTOM OF METADATA
});