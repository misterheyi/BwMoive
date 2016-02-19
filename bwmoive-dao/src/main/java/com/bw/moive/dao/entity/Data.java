package com.bw.moive.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Data {
	private Integer vId;// 主键
	private Integer cId;//频道ID
	private Integer tId;// 类型ID
	private Integer aId;// 所属地区
	private Integer vYear;//年份
	private String vPic;// 海报路径
	private String vName;// 名称
	private String vSpell;// 中文拼音
	private String vLetter;// 首字母
	private String vNickName;// 别名
	private String vEnName;// 英文名称
	private String vPublishYear;// 出品时间
	private String vPublishCompany;// 出品公司
	private String vShowBox;// 发行公司
	private String vPublishArea;// 制片地区
	private String vVideoArea;// 拍摄地点
	private String vVideoTime;// 拍摄日期
	private String vOnTime;// 首播时间，上映时间
	private String vOffTime;// 下映时间
	private String vDirector;// 导演
	private String vWriter;// 编剧
	private String vProducer;// 制片人
	private String vType;// 类型
	private String vActor;// 主演
	private String vTotal;// 集数
	private String vLength;// 片长
	private String vBoxOffice;// 票房
	private String vLanguage;// 语言
	private String vColor;// 色彩
	private String vImdb;// imdb编码
	private String vPerLength;// 每集长度
	private String vPresenter;// 出品人
	private String vOnlineShow;// 在线播放平台
	private String vTvShow;// 播出平台
	private String vDrama;// 概要剧情
	private String vDescription;// 详细描述
	private Integer vState;// 状态
	private BigDecimal vScore;// 站内评分
	private Integer vScoreNum;// 评分次数
	private BigDecimal vDoubanScore;// 豆瓣评分
	private BigDecimal vmTimeScore;// 时光评分
	private BigDecimal vImdbScore;// IMDB评分
	private BigDecimal vMeituanScore;// 美团评分
	private String vNote;// 备注
	private String vTags;// 标签
	private Integer vIsUnion;// 是否连载
	private String vCycle;//更新周期
	private String vVer;// 版本
	private String vRemark;// 备用说明
	private Integer vDigg;// 用户推荐
	private Integer vRank;// 等级
	private Integer vHit;// 总点击
	private Integer vDayHit;// 日点击
	private Integer vWeekHit;;// 周点击
	private Integer vMonthHit;// 月点	击
	private Date vHitTime;// 总点击统计时间
	private Date vDayTime;// 天点击统计时间
	private Date vWeekTime;// 周点击统计时间
	private Date vMonthTime;// 月点击统计时间
	private Date vCreateTime;// 创建时间
	private Date vUpdateTime;// 更新时间
	private String vSource;// 资料来源

	public Integer getvId() {
		return vId;
	}

	public void setvId(Integer vId) {
		this.vId = vId;
	}

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public Integer gettId() {
		return tId;
	}

	public void settId(Integer tId) {
		this.tId = tId;
	}

	public Integer getaId() {
		return aId;
	}

	public void setaId(Integer aId) {
		this.aId = aId;
	}

	public Integer getvYear() {
		return vYear;
	}

	public void setvYear(Integer vYear) {
		this.vYear = vYear;
	}

	public String getvPic() {
		return vPic;
	}

	public void setvPic(String vPic) {
		this.vPic = vPic;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public String getvSpell() {
		return vSpell;
	}

	public void setvSpell(String vSpell) {
		this.vSpell = vSpell;
	}

	public String getvLetter() {
		return vLetter;
	}

	public void setvLetter(String vLetter) {
		this.vLetter = vLetter;
	}

	public String getvNickName() {
		return vNickName;
	}

	public void setvNickName(String vNickName) {
		this.vNickName = vNickName;
	}

	public String getvEnName() {
		return vEnName;
	}

	public void setvEnName(String vEnName) {
		this.vEnName = vEnName;
	}

	public String getvPublishYear() {
		return vPublishYear;
	}

	public void setvPublishYear(String vPublishYear) {
		this.vPublishYear = vPublishYear;
	}

	public String getvPublishCompany() {
		return vPublishCompany;
	}

	public void setvPublishCompany(String vPublishCompany) {
		this.vPublishCompany = vPublishCompany;
	}

	public String getvShowBox() {
		return vShowBox;
	}

	public void setvShowBox(String vShowBox) {
		this.vShowBox = vShowBox;
	}

	public String getvPublishArea() {
		return vPublishArea;
	}

	public void setvPublishArea(String vPublishArea) {
		this.vPublishArea = vPublishArea;
	}

	public String getvVideoArea() {
		return vVideoArea;
	}

	public void setvVideoArea(String vVideoArea) {
		this.vVideoArea = vVideoArea;
	}

	public String getvVideoTime() {
		return vVideoTime;
	}

	public void setvVideoTime(String vVideoTime) {
		this.vVideoTime = vVideoTime;
	}

	public String getvOnTime() {
		return vOnTime;
	}

	public void setvOnTime(String vOnTime) {
		this.vOnTime = vOnTime;
	}

	public String getvOffTime() {
		return vOffTime;
	}

	public void setvOffTime(String vOffTime) {
		this.vOffTime = vOffTime;
	}

	public String getvDirector() {
		return vDirector;
	}

	public void setvDirector(String vDirector) {
		this.vDirector = vDirector;
	}

	public String getvWriter() {
		return vWriter;
	}

	public void setvWriter(String vWriter) {
		this.vWriter = vWriter;
	}

	public String getvProducer() {
		return vProducer;
	}

	public void setvProducer(String vProducer) {
		this.vProducer = vProducer;
	}

	public String getvType() {
		return vType;
	}

	public void setvType(String vType) {
		this.vType = vType;
	}

	public String getvActor() {
		return vActor;
	}

	public void setvActor(String vActor) {
		this.vActor = vActor;
	}

	public String getvTotal() {
		return vTotal;
	}

	public void setvTotal(String vTotal) {
		this.vTotal = vTotal;
	}

	public String getvLength() {
		return vLength;
	}

	public void setvLength(String vLength) {
		this.vLength = vLength;
	}

	public String getvBoxOffice() {
		return vBoxOffice;
	}

	public void setvBoxOffice(String vBoxOffice) {
		this.vBoxOffice = vBoxOffice;
	}

	public String getvLanguage() {
		return vLanguage;
	}

	public void setvLanguage(String vLanguage) {
		this.vLanguage = vLanguage;
	}

	public String getvColor() {
		return vColor;
	}

	public void setvColor(String vColor) {
		this.vColor = vColor;
	}

	public String getvImdb() {
		return vImdb;
	}

	public void setvImdb(String vImdb) {
		this.vImdb = vImdb;
	}

	public String getvPerLength() {
		return vPerLength;
	}

	public void setvPerLength(String vPerLength) {
		this.vPerLength = vPerLength;
	}

	public String getvPresenter() {
		return vPresenter;
	}

	public void setvPresenter(String vPresenter) {
		this.vPresenter = vPresenter;
	}

	public String getvOnlineShow() {
		return vOnlineShow;
	}

	public void setvOnlineShow(String vOnlineShow) {
		this.vOnlineShow = vOnlineShow;
	}

	public String getvTvShow() {
		return vTvShow;
	}

	public void setvTvShow(String vTvShow) {
		this.vTvShow = vTvShow;
	}

	public String getvDrama() {
		return vDrama;
	}

	public void setvDrama(String vDrama) {
		this.vDrama = vDrama;
	}

	public String getvDescription() {
		return vDescription;
	}

	public void setvDescription(String vDescription) {
		this.vDescription = vDescription;
	}

	public Integer getvState() {
		return vState;
	}

	public void setvState(Integer vState) {
		this.vState = vState;
	}

	public BigDecimal getvScore() {
		return vScore;
	}

	public void setvScore(BigDecimal vScore) {
		this.vScore = vScore;
	}

	public Integer getvScoreNum() {
		return vScoreNum;
	}

	public void setvScoreNum(Integer vScoreNum) {
		this.vScoreNum = vScoreNum;
	}

	public BigDecimal getvDoubanScore() {
		return vDoubanScore;
	}

	public void setvDoubanScore(BigDecimal vDoubanScore) {
		this.vDoubanScore = vDoubanScore;
	}

	public BigDecimal getVmTimeScore() {
		return vmTimeScore;
	}

	public void setVmTimeScore(BigDecimal vmTimeScore) {
		this.vmTimeScore = vmTimeScore;
	}

	public BigDecimal getvImdbScore() {
		return vImdbScore;
	}

	public void setvImdbScore(BigDecimal vImdbScore) {
		this.vImdbScore = vImdbScore;
	}

	public BigDecimal getvMeituanScore() {
		return vMeituanScore;
	}

	public void setvMeituanScore(BigDecimal vMeituanScore) {
		this.vMeituanScore = vMeituanScore;
	}

	public String getvNote() {
		return vNote;
	}

	public void setvNote(String vNote) {
		this.vNote = vNote;
	}

	public String getvTags() {
		return vTags;
	}

	public void setvTags(String vTags) {
		this.vTags = vTags;
	}

	public Integer getvIsUnion() {
		return vIsUnion;
	}

	public void setvIsUnion(Integer vIsUnion) {
		this.vIsUnion = vIsUnion;
	}

	public String getvVer() {
		return vVer;
	}

	public void setvVer(String vVer) {
		this.vVer = vVer;
	}

	public String getvRemark() {
		return vRemark;
	}

	public void setvRemark(String vRemark) {
		this.vRemark = vRemark;
	}

	public Integer getvDigg() {
		return vDigg;
	}

	public void setvDigg(Integer vDigg) {
		this.vDigg = vDigg;
	}

	public Integer getvRank() {
		return vRank;
	}

	public void setvRank(Integer vRank) {
		this.vRank = vRank;
	}

	public Integer getvHit() {
		return vHit;
	}

	public void setvHit(Integer vHit) {
		this.vHit = vHit;
	}

	public Integer getvDayHit() {
		return vDayHit;
	}

	public void setvDayHit(Integer vDayHit) {
		this.vDayHit = vDayHit;
	}

	public Integer getvWeekHit() {
		return vWeekHit;
	}

	public void setvWeekHit(Integer vWeekHit) {
		this.vWeekHit = vWeekHit;
	}

	public Integer getvMonthHit() {
		return vMonthHit;
	}

	public void setvMonthHit(Integer vMonthHit) {
		this.vMonthHit = vMonthHit;
	}

	public Date getvHitTime() {
		return vHitTime;
	}

	public void setvHitTime(Date vHitTime) {
		this.vHitTime = vHitTime;
	}

	public Date getvDayTime() {
		return vDayTime;
	}

	public void setvDayTime(Date vDayTime) {
		this.vDayTime = vDayTime;
	}

	public Date getvWeekTime() {
		return vWeekTime;
	}

	public void setvWeekTime(Date vWeekTime) {
		this.vWeekTime = vWeekTime;
	}

	public Date getvMonthTime() {
		return vMonthTime;
	}

	public void setvMonthTime(Date vMonthTime) {
		this.vMonthTime = vMonthTime;
	}

	public Date getvCreateTime() {
		return vCreateTime;
	}

	public void setvCreateTime(Date vCreateTime) {
		this.vCreateTime = vCreateTime;
	}

	public Date getvUpdateTime() {
		return vUpdateTime;
	}

	public void setvUpdateTime(Date vUpdateTime) {
		this.vUpdateTime = vUpdateTime;
	}

	public String getvSource() {
		return vSource;
	}

	public void setvSource(String vSource) {
		this.vSource = vSource;
	}

	public String getvCycle() {
		return vCycle;
	}

	public void setvCycle(String vCycle) {
		this.vCycle = vCycle;
	}

}
