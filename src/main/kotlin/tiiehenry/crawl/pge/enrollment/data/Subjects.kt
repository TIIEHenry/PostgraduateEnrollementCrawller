package tiiehenry.crawl.pge.enrollment.data

//var text="";$("#yjxkdm option").map(function(){var name=$(this).text().substring(6);var code=$(this).val();text=text+name+"_"+code+"(\""+code+"\","+"\""+name+"\""+"),\n"});text
@Suppress("NonAsciiCharacters")
enum class Subjects(val subjectCode: String, val subjectName: String, val degree: 学位 = 学位.学术学位) {
    金融_0251("0251", "金融", 学位.专业学位),
    应用统计_0252("0252", "应用统计", 学位.专业学位),
    税务_0253("0253", "税务", 学位.专业学位),
    国际商务_0254("0254", "国际商务", 学位.专业学位),
    保险_0255("0255", "保险", 学位.专业学位),
    资产评估_0256("0256", "资产评估", 学位.专业学位),
    审计_0257("0257", "审计", 学位.专业学位),
    法律_0351("0351", "法律", 学位.专业学位),
    社会工作_0352("0352", "社会工作", 学位.专业学位),
    警务_0353("0353", "警务", 学位.专业学位),
    教育_0451("0451", "教育", 学位.专业学位),
    体育_0452("0452", "体育", 学位.专业学位),
    汉语国际教育_0453("0453", "汉语国际教育", 学位.专业学位),
    应用心理_0454("0454", "应用心理", 学位.专业学位),
    翻译_0551("0551", "翻译", 学位.专业学位),
    新闻与传播_0552("0552", "新闻与传播", 学位.专业学位),
    出版_0553("0553", "出版", 学位.专业学位),
    文物与博物馆_0651("0651", "文物与博物馆", 学位.专业学位),
    建筑学_0851("0851", "建筑学", 学位.专业学位),
    城市规划_0853("0853", "城市规划", 学位.专业学位),
    电子信息_0854("0854", "电子信息", 学位.专业学位),
    机械_0855("0855", "机械", 学位.专业学位),
    材料与化工_0856("0856", "材料与化工", 学位.专业学位),
    资源与环境_0857("0857", "资源与环境", 学位.专业学位),
    能源动力_0858("0858", "能源动力", 学位.专业学位),
    土木水利_0859("0859", "土木水利", 学位.专业学位),
    生物与医药_0860("0860", "生物与医药", 学位.专业学位),
    交通运输_0861("0861", "交通运输", 学位.专业学位),
    农业_0951("0951", "农业", 学位.专业学位),
    兽医_0952("0952", "兽医", 学位.专业学位),
    风景园林_0953("0953", "风景园林", 学位.专业学位),
    林业_0954("0954", "林业", 学位.专业学位),
    临床医学_1051("1051", "临床医学", 学位.专业学位),
    口腔医学_1052("1052", "口腔医学", 学位.专业学位),
    公共卫生_1053("1053", "公共卫生", 学位.专业学位),
    护理_1054("1054", "护理", 学位.专业学位),
    药学_1055("1055", "药学", 学位.专业学位),
    中药学_1056("1056", "中药学", 学位.专业学位),
    中医_1057("1057", "中医", 学位.专业学位),
    军事_1151("1151", "军事", 学位.专业学位),
    工商管理_1251("1251", "工商管理", 学位.专业学位),
    公共管理_1252("1252", "公共管理", 学位.专业学位),
    会计_1253("1253", "会计", 学位.专业学位),
    旅游管理_1254("1254", "旅游管理", 学位.专业学位),
    图书情报_1255("1255", "图书情报", 学位.专业学位),
    工程管理_1256("1256", "工程管理", 学位.专业学位),
    艺术_1351("1351", "艺术", 学位.专业学位),


    哲学_0101("0101", "哲学"),

    理论经济学_0201("0201", "理论经济学"),
    应用经济学_0202("0202", "应用经济学"),
    统计学_0270("0270", "统计学"),

    法学_0301("0301", "法学"),
    政治学_0302("0302", "政治学"),
    社会学_0303("0303", "社会学"),
    民族学_0304("0304", "民族学"),
    马克思主义理论_0305("0305", "马克思主义理论"),
    公安学_0306("0306", "公安学"),
    教育学_0401("0401", "教育学"),
    心理学_0402("0402", "心理学"),
    体育学_0403("0403", "体育学"),
    _0471("0471", ""),
    中国语言文学_0501("0501", "中国语言文学"),
    外国语言文学_0502("0502", "外国语言文学"),
    新闻传播学_0503("0503", "新闻传播学"),
    考古学_0601("0601", "考古学"),
    中国史_0602("0602", "中国史"),
    世界史_0603("0603", "世界史"),
    数学_0701("0701", "数学"),
    物理学_0702("0702", "物理学"),
    化学_0703("0703", "化学"),
    天文学_0704("0704", "天文学"),
    地理学_0705("0705", "地理学"),
    大气科学_0706("0706", "大气科学"),
    海洋科学_0707("0707", "海洋科学"),
    地球物理学_0708("0708", "地球物理学"),
    地质学_0709("0709", "地质学"),
    生物学_0710("0710", "生物学"),
    系统科学_0711("0711", "系统科学"),
    科学技术史_0712("0712", "科学技术史"),
    生态学_0713("0713", "生态学"),
    统计学_0714("0714", "统计学"),
    心理学_0771("0771", "心理学"),
    力学_0772("0772", "力学"),
    材料科学与工程_0773("0773", "材料科学与工程"),
    电子科学与技术_0774("0774", "电子科学与技术"),
    计算机科学与技术_0775("0775", "计算机科学与技术"),
    环境科学与工程_0776("0776", "环境科学与工程"),
    生物医学工程_0777("0777", "生物医学工程"),
    基础医学_0778("0778", "基础医学"),
    公共卫生与预防医学_0779("0779", "公共卫生与预防医学"),
    药学_0780("0780", "药学"),
    中药学_0781("0781", "中药学"),
    医学技术_0782("0782", "医学技术"),
    护理学_0783("0783", "护理学"),
    _0784("0784", ""),
    _0785("0785", ""),
    _0786("0786", ""),
    力学_0801("0801", "力学"),
    机械工程_0802("0802", "机械工程"),
    光学工程_0803("0803", "光学工程"),
    仪器科学与技术_0804("0804", "仪器科学与技术"),
    材料科学与工程_0805("0805", "材料科学与工程"),
    冶金工程_0806("0806", "冶金工程"),
    动力工程及工程热物理_0807("0807", "动力工程及工程热物理"),
    电气工程_0808("0808", "电气工程"),
    电子科学与技术_0809("0809", "电子科学与技术"),
    信息与通信工程_0810("0810", "信息与通信工程"),
    控制科学与工程_0811("0811", "控制科学与工程"),
    计算机科学与技术_0812("0812", "计算机科学与技术"),
    建筑学_0813("0813", "建筑学"),
    土木工程_0814("0814", "土木工程"),
    水利工程_0815("0815", "水利工程"),
    测绘科学与技术_0816("0816", "测绘科学与技术"),
    化学工程与技术_0817("0817", "化学工程与技术"),
    地质资源与地质工程_0818("0818", "地质资源与地质工程"),
    矿业工程_0819("0819", "矿业工程"),
    石油与天然气工程_0820("0820", "石油与天然气工程"),
    纺织科学与工程_0821("0821", "纺织科学与工程"),
    轻工技术与工程_0822("0822", "轻工技术与工程"),
    交通运输工程_0823("0823", "交通运输工程"),
    船舶与海洋工程_0824("0824", "船舶与海洋工程"),
    航空宇航科学与技术_0825("0825", "航空宇航科学与技术"),
    兵器科学与技术_0826("0826", "兵器科学与技术"),
    核科学与技术_0827("0827", "核科学与技术"),
    农业工程_0828("0828", "农业工程"),
    林业工程_0829("0829", "林业工程"),
    环境科学与工程_0830("0830", "环境科学与工程"),
    生物医学工程_0831("0831", "生物医学工程"),
    食品科学与工程_0832("0832", "食品科学与工程"),
    城乡规划学_0833("0833", "城乡规划学"),
    风景园林学_0834("0834", "风景园林学"),
    软件工程_0835("0835", "软件工程"),
    生物工程_0836("0836", "生物工程"),
    安全科学与工程_0837("0837", "安全科学与工程"),
    公安技术_0838("0838", "公安技术"),
    网络空间安全_0839("0839", "网络空间安全"),
    科学技术史_0870("0870", "科学技术史"),
    管理科学与工程_0871("0871", "管理科学与工程"),
    设计学_0872("0872", "设计学"),
    作物学_0901("0901", "作物学"),
    园艺学_0902("0902", "园艺学"),
    农业资源与环境_0903("0903", "农业资源与环境"),
    植物保护_0904("0904", "植物保护"),
    畜牧学_0905("0905", "畜牧学"),
    兽医学_0906("0906", "兽医学"),
    林学_0907("0907", "林学"),
    水产_0908("0908", "水产"),
    草学_0909("0909", "草学"),
    科学技术史_0970("0970", "科学技术史"),
    环境科学与工程_0971("0971", "环境科学与工程"),
    食品科学与工程_0972("0972", "食品科学与工程"),
    风景园林学_0973("0973", "风景园林学"),
    基础医学_1001("1001", "基础医学"),
    临床医学_1002("1002", "临床医学"),
    口腔医学_1003("1003", "口腔医学"),
    公共卫生与预防医学_1004("1004", "公共卫生与预防医学"),
    中医学_1005("1005", "中医学"),
    中西医结合_1006("1006", "中西医结合"),
    药学_1007("1007", "药学"),
    中药学_1008("1008", "中药学"),
    特种医学_1009("1009", "特种医学"),
    医学技术_1010("1010", "医学技术"),
    护理学_1011("1011", "护理学"),
    科学技术史_1071("1071", "科学技术史"),
    生物医学工程_1072("1072", "生物医学工程"),
    _1073("1073", ""),
    _1074("1074", ""),
    军事思想及军事历史_1101("1101", "军事思想及军事历史"),
    战略学_1102("1102", "战略学"),
    战役学_1103("1103", "战役学"),
    战术学_1104("1104", "战术学"),
    军队指挥学_1105("1105", "军队指挥学"),
    军事管理学_1106("1106", "军事管理学"),
    军队政治工作学_1107("1107", "军队政治工作学"),
    军事后勤学_1108("1108", "军事后勤学"),
    军事装备学_1109("1109", "军事装备学"),
    军事训练学_1110("1110", "军事训练学"),
    管理科学与工程_1201("1201", "管理科学与工程"),
    工商管理_1202("1202", "工商管理"),
    农林经济管理_1203("1203", "农林经济管理"),
    公共管理_1204("1204", "公共管理"),
    图书情报与档案管理_1205("1205", "图书情报与档案管理"),
    艺术学理论_1301("1301", "艺术学理论"),
    音乐与舞蹈学_1302("1302", "音乐与舞蹈学"),
    戏剧与影视学_1303("1303", "戏剧与影视学"),
    美术学_1304("1304", "美术学"),
    设计学_1305("1305", "设计学");

    fun fromCode(code: String): Subjects? {
        values().forEach {
            if (it.subjectCode.equals(code))
                return it
        }
        return null;
    }
}