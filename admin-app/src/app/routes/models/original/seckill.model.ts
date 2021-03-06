import {Coupon} from "./coupon.model";
import {Product} from "./product.model";

export class Seckill {

    /**
       * 秒杀活动ID
     */
    id:number;

    /**
       * GUID
     */
    guid:string;

    /**
       * 活动标签
     */
    label:string;

    /**
       * 开始时间
     */
    startTime:string;

    /**
       * 结束时间
     */
    endTime:string;

    /**
       * 活动封面
     */
    activityCover:string;

    /**
       * 分享标题
     */
    shareTitle:string;

    /**
       * 商品（product表ID）
     */
    product:Product;

    /**
       * 活动库存
     */
    activityStock:number;

    /**
       * 秒杀价
     */
    seckillPrice:number;

    /**
       * 限购数量
     */
    limitQuantity:number;

    /**
       * 支付时限（单位分钟），XX分钟内不支付，自动释放库存
     */
    limitPayTime:number;

    /**
       * 奖励类型（1积分2优惠券）
     */
    rewardType:number;

    /**
       * 奖励积分
     */
    rewardIntegral:number;

    /**
       * 优惠券（coupon表ID）
     */
    coupon:Coupon;

    /**
       * 运费设置（1卖家包邮2买家承担运费）
     */
    freightSet:number;

    /**
       * 运费
     */
    freight:number;

    /**
       * 状态（0启用1禁用）
     */
    state:number;

    /**
       * 创建时间
     */
    createTime:string;

    /**
       * 删除（0否1是）
     */
    deleted:number;

    /**
       * 删除时间
     */
    delTime:string;
}
