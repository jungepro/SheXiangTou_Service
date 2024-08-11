import request from '@/utils/request'

// 查询摄像头列表
export function listCamera(query) {
  return request({
    url: '/shuai/camera/list',
    method: 'get',
    params: query
  })
}

// 查询摄像头详细
export function getCamera(id) {
  return request({
    url: '/shuai/camera/' + id,
    method: 'get'
  })
}

// 新增摄像头
export function addCamera(data) {
  return request({
    url: '/shuai/camera',
    method: 'post',
    data: data
  })
}

// 修改摄像头
export function updateCamera(data) {
  return request({
    url: '/shuai/camera',
    method: 'put',
    data: data
  })
}

// 删除摄像头
export function delCamera(id) {
  return request({
    url: '/shuai/camera/' + id,
    method: 'delete'
  })
}

// 导出摄像头


export function doScan() {
  return request({
    url: '/shuai/camera/doScan',
    method: 'get'
  })
}
