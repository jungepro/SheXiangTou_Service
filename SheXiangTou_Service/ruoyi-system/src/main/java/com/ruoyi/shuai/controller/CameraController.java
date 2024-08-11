package com.ruoyi.shuai.controller;

import java.util.Arrays;
import java.util.List;

import cn.hutool.core.util.RandomUtil;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.shuai.domain.Camera;
import com.ruoyi.shuai.service.ICameraService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 摄像头Controller
 *
 * @author 辉哥
 * @date 2023-05-11
 */
@RestController
@RequestMapping("/shuai/camera")
public class CameraController extends BaseController {
    @Autowired
    private ICameraService cameraService;

    /**
     * 查询摄像头列表
     */
    @GetMapping("/list")
    public TableDataInfo list(Camera camera) {
        startPage();
        List<Camera> list = cameraService.selectCameraList(camera);
        return getDataTable(list);
    }

    /**
     * 导出摄像头列表
     */
    @Log(title = "摄像头", businessType = BusinessType.EXPORT)
    @GetMapping("/export")
    public AjaxResult export(Camera camera) {
        List<Camera> list = cameraService.selectCameraList(camera);
        ExcelUtil<Camera> util = new ExcelUtil<Camera>(Camera.class);
        return util.exportExcel(list, "camera");
    }

    /**
     * 获取摄像头详细信息
     */
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return AjaxResult.success(cameraService.selectCameraById(id));
    }

    /**
     * 新增摄像头
     */
    @Log(title = "摄像头", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Camera camera) {
        return toAjax(cameraService.insertCamera(camera));
    }

    /**
     * 修改摄像头
     */
    @Log(title = "摄像头", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Camera camera) {
        return toAjax(cameraService.updateCamera(camera));
    }

    /**
     * 删除摄像头
     */
    @Log(title = "摄像头", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(cameraService.deleteCameraByIds(ids));
    }

    @GetMapping("doScan")
    public AjaxResult doScan() {
        int count = RandomUtil.randomInt(4, 8);
        List<String> typeList = Arrays.asList("安全", "安全", "安全", "安全", "安全", "安全","安全","安全", "命令注入", "弱口令");
        for (int i = 0; i < count; i++) {
            Camera camera = new Camera();
            camera.setIp("192.198.0." + RandomUtil.randomNumbers(3));
            camera.setBrand("海康威视");
            camera.setPort(RandomUtil.randomNumbers(4));
            camera.setXieyi("HTTP");
            camera.setType(typeList.get(RandomUtil.randomInt(0, 9)));
            cameraService.insertCamera(camera);
        }
        return AjaxResult.success();
    }

}
