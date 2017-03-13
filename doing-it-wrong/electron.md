# 2017

* March
  * Use `electron.ipcRenderer` on renderer processes, `electron.ipcMain` on main process.
  * The proper way to send messages from `ipcMain` to `ipcRenderer` is invoking `window.webContents.sendMessage`, where window is a `electron.BrowserWindow` instance.
  * [bwin's comment on issue #991](https://github.com/electron/electron/issues/991#issuecomment-69361424) provides a nice outlook.