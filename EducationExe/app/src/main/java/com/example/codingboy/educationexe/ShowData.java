package com.example.codingboy.educationexe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.codingboy.educationexe.firstday.SecondPage;
import com.example.codingboy.educationexe.firstday.SecondPagePm;
import com.example.codingboy.educationexe.secondday.SecondPage2;
import com.example.codingboy.educationexe.secondday.SecondPage2Pm;
import com.example.codingboy.educationexe.secondday.SecondPage2Pm2;
import com.example.codingboy.educationexe.thirdday.SecondPage3;

/**
 * Created by codingBoy on 16/5/12.
 */
public class ShowData extends Activity
{
    private TextView textView;
    private Button backbtn;

    String data11="\n" +
            "        张耀灿，男，广东南海人，1937年10月出生，华中师范大学马克思主义学院教授、博士生导师。中国高等教育学会常务理事、全国高校思想政治教育研究会顾问，我国思想政治教育学科创始人之一。曾任国务院学位委员会第四届政治学社会学民族学学科评议组成员，全国博士后管理委员会专家组成员。现任全国高校思想政治教育研究会学术委员会顾问、全国高校马克思主义理论学科研究会顾问，《思想教育研究》和《思想政治教育研究》杂志顾问。湖北省重点学科学术带头人。教育部哲学社会科学重点研究基地清华大学高校德育研究中心学术委员会委员，社会主义核心价值观协同创新研究中心顾问，《马克思主义理论研究》和《社会主义核心价值观研究》杂志顾问，湖北省哲学社会科学重点研究基地湖北大学青少年思想政治教育研究中心学术委员会主任。1993年起享受国务院颁发的政府特殊津贴，1993年获曾宪梓教育基金会高等师范院校教师奖三等奖。被多所高校聘为兼职教授。2014年被中囯社会科学研究院研究生院聘为博士生导师，参与“马克思主义理论骨干人才培养计划”工作招收博士生。\n\n" +
            "        张耀灿教授的研究方向是思想政治教育基本理论与实践。主要教学是开设硕士生课程“邓小平理论与‘三个代表’重要思想专题研究”、“思想理论教育前沿问题研究”；开设博士生课程“思想理论教育前沿问题专题研究”、“思想政治教育学科建设专题研究”。长期致力于思想政治教育学的教学和研究工作，有较深学术造诣和丰富的教学经验，多项成果在思想政治教育基本理论方面具有原创性贡献，在思想政治教育学界产生广泛影响。已招收和培养硕士生、博士生近百人。\n\n" +
            "        主持科研项目有：教育部哲学社会科学研究重大课题攻关项目“高校思想政治理论课教学测评体系研究”，囯家社科基金课题“社会主义市场经济体制建立中思想政治教育整体改革研究”，教育部哲学社会科学研究课题“现代思想政治教育学研究”，面向21世纪课程教材《思想政治教育学原理》《中国共产党思想政治工作史论》，“研究生教学用书”《现代思想政治教育学》《中国共产党思想政治教育史论》，全国高校思想政治教育研究会重点课题“思想政治教育分支学科建设研究”“高校贫困生问题研究”等21项。\n\n" +
            "        出版的主要学术著作有《高校思想政治理论课教育教学质量监测体系研究》 《现代思想政治教育学科论》《思想政治教育学前沿》《思想政治教育学原理》《20世纪中国高等教育·德育卷》《成才不是梦：高校贫困生的今天和未来》《新世纪高校灵魂工程》等33部；近年来发表的代表性论文有《经济全球化与思想政治教育的创新》《现代思想政治教育特点和规律探析》《推进思想政治教育研究范式的人学转换》《新中国成立以来高校思想政治理论课教学测评的发展历程和基本经验》《思想政治教育学科理论体系和创新研究》《社会建设：构建社会主义和谐社会的核心》等百余篇。\n\n" +
            "        研究成果获奖的有：教育部教改研究重点课题最终成果“高师面向21世纪思想政治教育专业课程体系、教学内容和教学方法总体改革研究”获囯家级教学成果二等奖，《大学德育概论》获全囯改革开放十年来优秀教育理论著奖，《现代思想政治教育学》获全囯高校思想政治教育研究会优秀著作一等奖、中国高校哲学社会科学研究优秀著作二等奖，《思想政治教育学原理》、《中国共产党思想政治工作史论》均获教育部优秀高校教材二等奖等十余个奖项。";
    String data12="        谢守成，华中师范大学党委副书记，教授、博士生导师，华中师范大学中国大学生教育与发展研究中心主任、湖北省中国特色社会主义理论研究中心华中师范大学研究基地主任，兼任全国高校辅导员工作研究会副会长。近年来主持教育部哲学社会科学重大项目等省部级课题多项，主编并出版著作、教材十多部，在《光明日报》（理论版）、《中国高等教育》、《高校理论战线》、《思想教育研究》等重点核心期刊发表论文数十篇。\n";
    String data13="        董玉来,上海海洋大学马克思主义学院院长，上海高校思想政治理论课名师工作室——董玉来工作室主持人，上海市延安精神研究会副秘书长，上海《东方讲坛》讲师。曾获上海市育才奖，上海市级教学成果一等奖，易班“十佳网络名师”，全国高校思想政治理论课教师2014年影响力提名人物。主要从事思想政治教育和高等教育管理研究。出版《微博之力》、《媒体中的@沪城学士》和《2014媒体中的沪城学士》等专著。\n\n" +
            "        网名“沪城学士”，其新浪网发布的800多条微博先后被《人民日报》《人民网》《新华网》《央广新闻》《人民文摘》《央视新闻》《人民日报新浪微博》等全国一百余家报纸、网络、杂志、电台、电视、官方微博转载（播）。";
    String data14="        王慧敏：教育部中国大学生在线辅导员工作部主任，全国高校辅导员网络培训核心课程建设项目负责人。历届全国高校辅导员优秀博客评选活动、2015首届全国高校思政网络宣传作品评选活动负责人。在高校辅导员网络思政工作方面有丰富经验。 \n";
    String data15="        覃红，华中师范大学党委副书记，教授、博士生导师，现为教育部高等学校统计学类专业教学指导委员会委员、中国数学学会均匀设计分会副理事长、中国现场统计研究会试验设计分会副理事长、中国现场统计研究会理事、美国《Mathematical Reviews》评论员。近年来，主持教育部人文社会科学研究专项任务项目等课题多项，入选教育部“新世纪优秀人才支持计划”和“湖北省新世纪高层次人才工程”。\n";
    String data16="        吴军其，男，1972年2月出生，教授，理学博士（教育技术学专业），博士研究生导师，留美学者，华中师范大学教师教学发展中心执行主任，华中师范大学教育信息技术学院教授，国家数字化学习工程技术研究中心教学创新研究部主任，华中师范大学第五届教学竞赛第一名获得者,国家级来华留学英语授课品牌课程《教学技术与媒体》（Instructional Technology Media）负责人；2004年至2005年在美国伊利诺依州立大学（UIUC）留学访问；2012年在美国密西根大学CRLT（Center for Research on Learning and Teaching, U-M）学习交流；2014年带领华中师大骨干教师团到美国纽约州立大学研修（SUNY Oswego）；主要研究方向为教育技术学、信息化环境下的课堂教学、教育信息化、信息技术教育和远程教育等。在国内外核心期刊上发表专业学术论文三十余篇，出版专著和主编教材共十一册，作为项目负责人先后主持国家级项目二项，省部级项目四项，获国家软件著作权六项，2014年获国家级教学成果奖二等奖。";
    String data17="        田媛，女，博士，华中师范大学心理学院副教授、硕士生导师，青少年网络心理与行为教育部重点实验室研究成员。获霍英东教育基金会第十五届高等院校青年教师奖、华中师范大学第二届本科教学创新奖一等奖、湖北省第四届青年教师教学竞赛二等奖、华中师范大学第九届教师教学竞赛一等奖、华中师范大学优秀党务工作者、十佳班主任、十佳女职工等。设计并录制的《媛知媛谓讲心理》网络微课程上线一小时点击量突破20000次，获得学生广泛好评；受到长江日报、武汉晚报、武汉电视台、湖北人民出版社等多家媒体关注与采访，腾讯大楚网头版推送，点击量80余万次；和学生一起拍摄剪辑的课程作业微视频《时间的礼物》在网上被广泛转载。撰写并参与出版著作、教材6部；指导学生参加竞赛、科技创新、社会实践4项；主持并参与教研项目3项，其中两项校级、一项国家级。\n\n" +
            "    研究领域为发展与教育心理学，主要研究工作集中在社会性与人格发展、心理健康教育、青少年网络心理与行为、毕生发展方向。主持并参与全国教育科学“十二五”规划项目、湖北省教育科学“十二五”规划项目、教育部人文社会科学项目、国家863计划子项目、“十二五”科技支撑计划子项目、国家社科基金重大攻关项目等国家、省部级和国际合作科研项目十余项，并在多个项目中承担和完成了较为重要的科研任务，出版著作、译著4部，发表相关科研论文多篇。";
    String data18="        李勤，男，1981年生，汉族。1999年进入武汉大学计算机学院学习，2003年留校担任计算机学院辅导员，历任计算机学院团委副书记、团委书记，2008年任校团委副书记，2014年任党委学生工作部副部长。曾获全国高校优秀辅导员、全国教育系统先进个人、湖北省三育人先进个人、湖北省暑期社会实践先进个人、武汉大学优秀党员、武汉大学十佳杰出青年、武汉大学思想政治工作先进个人等荣誉称号。主持武汉大学教改项目《基于第二课堂提升人才培养质量的途径研究》、参与武汉大学思政项目《基于微信公众号的武汉大学校园文化传播策略研究》、《武汉大学台湾地区学生融入性教育途径研究》等项目。";
    String data19="杨灵珍 \n\n" +
            "女，浙江衢州人，华中师范大学城市与环境科学学院，辅导员，思政讲师。\n\n" +
            "学习经历\n\n" +
            "    1.2003年9月—2007年6月，在华中师范大学学习，获理学学士学位；\n\n" +
            "    2.2007年9月—2010年6月，在华中师范大学学习，获经济学硕士学位；\n\n" +
            "    3.2014年9月—至今，在华中师范大学学习，博士在读。\n\n" +
            "\n" +
            "    培训经历\n\n" +
            "    1.2015年5月—6月，台湾师范大学学生事务处研修培训\n\n" +
            "    2.2012年8月，湖北省哲学社会科学教学科研骨干研修班\n\n" +
            "    3.2011年11月，湖北高校政工干部大学生心理健康教育培训班\n\n" +
            "\n" +
            "    科研、授课及获奖\n\n" +
            "        主持各类课题3项，参与课题研究4项，参编著作2部，发表论文6篇，参与《师范生生涯发展》、《大学生求职策略与技巧》等课程授课，是华中师范大学“学生工作与思想政治理论课融合计划”成员，所讲授的《思想道德修养》专题深受学生欢迎。\n\n" +
            "        曾获学校“优秀党务工作者”、“优秀共产党员”、“创先争优先进个人”等称号，两次获评学校“优秀辅导员”称号（1次综合奖、1次单项奖），此外，是华师首届“十佳政工干部”获得者。2014年获辅导员专项奖励一等奖，2016年参加湖北省第五届辅导员职业能力大赛以第一名的成绩获得一等奖。\n\n";
    String data21="暂无简介";
    String data22="暂无简介";
    String data23="暂无简介";
    String data24="郭明飞 \n" +
            "\n" +
            "河南汝南人  法学博士   教授   博士生导师    \n" +
            "\n" +
            "学习经历 \n" +
            "\n" +
            "    1995年9月----1998年7月，在湖北大学学习，获法学硕士学位；\n" +
            "    2004年9月----2007年7月，在华中师范大学学习，获法学博士学位；\n" +
            "    2011年8月----2012年8月，澳大利亚麦考瑞大学访问学者。\n" +
            "\n" +
            "研究方向 \n" +
            "\n" +
            "    中国特色网络文化建设、网络文化安全治理、意识形态管理 \n" +
            "\n" +
            "承担项目\n\n" +
            "    1、《微博空间的国家意识形态安全风险与防范体系构建》（主持人，2013度国家社科基金项目）；\n" +
            "    2、《以马克思主义中国化最新成果引导网络舆论研究》（主持人，2011年度教育部人文社科专项任务项目）； \n" +
            "    3、《以社会主义主流意识形态引领网络文化发展研究》（主持人，2011度年文化部年度项目）； \n" +
            "    4、《突发事件网络舆情的分析研判与处置机制研究》（主持人，2012年度中国行政管理学会科研课题）； \n" +
            "    5、《新媒体的热点聚焦与武汉网络舆情分析研判机制研究》（主持人，2011年度武汉市社科基金项目）； \n" +
            "    6、《新媒体传播对我国意识形态安全的挑战及对策研究》（主持人，2015年度湖北省教育厅哲学社会科学研究重大项目）； \n" +
            "    7、《网络文化革命视域下社会主义核心价值体系建设研究》（主持人，2010年度中央高校自主科研项目）； \n" +
            "    8、湖北省委宣传部重点调研课题《在基层意识形态工作缺乏有效抓手和保障的情况下，如何建立健全科学有效地意识形态工作体系和体制机制》（主持人，2014年）\n" +
            "    9、《中共早期领导人遗著的收集、整理与研究》（子课题主持人，2011年度国家社科基金重大项目）；\n" +
            "    10、《武汉地区教师教育现状及发展趋势研究》（主持人，2006年度武汉市社科基金项目）； \n" +
            "    11、《高校辅导员职业化研究》（主持人，2007年度湖北省教育厅人文社科专项任务项目）； \n" +
            "    12、参与省部级以上项目多项。 \n" +
            "\n" +
            "主要成果 \n" +
            "\n" +
            "一、专著：\n\n" +
            "    1.《网络发展与我国意识形态安全》 ，中国社会科学出版社2009年1月 ，独著；\n" +
            "    2.《科学社会主义理论与实践》，华中师范大学出版社2007年2月，参编。\n\n" +
            "二、学术论文：\n\n" +
            "    1. 《论网络新媒体背景下高校意识形态管理》，贵州社会科学，2016年第5期；\n" +
            "    2. 《网络空间意识形态安全的情势与策略——基于大数据背景下的考察与分析》，江汉论坛，2016年第5期；\n" +
            "    3.《微空间的国家意识形态安全风险及其防范体系构建》，湖北行政学院学报，2015年第2期，《中国社会科学文摘》2015年第8期全文转摘，《人大复印资料》2015年第9期全文转载，《新华文摘》、2015年第16期论点摘编；\n" +
            "    4、 《互联网上影响我国主流意识形态建设的社会思潮分析》，江汉论坛，2014年第3期，中国社会科学文摘2014年第9期全文转摘；\n" +
            "    5、《微时代的主流意识形态认同危机及其治理》，江西社会科学，2014年第6期，人大复印资料2014年第9期全文转摘； \n" +
            "    6.《创新网络思想政治教育》，人民日报，2013年11月21日，新华网、人民网、光明网、凤凰网、环球网、中新网、南海网、中国经济网、中工网、中国青年网、搜狐、新浪、网易、腾讯等多家媒体转载； \n" +
            "    7.《国外对因特网管制的做法及其启示》，政治学研究， 2008年第4期；\n" +
            "    8. 《网络舆论消极难控的现状及起引导》，马克思主义与现实，2008年第5期；\n" +
            "    9. 《互联网时代我国意识形态工作面临的挑战与对策》，马克思主义与现实，2009年第6期；\n" +
            "    10. 《软实力竞争与网络时代的文化安全》，马克思主义与现实，2011年第3期；\n" +
            "    11. 《互联网发展对社会主义理论的挑战》，科学社会主义，2008年第3期；\n" +
            "    12.《以社会主义核心价值观引导网络舆论简析》，学校党建与思想教育，2013年第2期； \n" +
            "    13.《网络竞争彰显软实力》，中国社会科学报，2013年10月11日； \n" +
            "    14.《对全球化背景下意识形态概念多重纬度的考察与分析》，理论探讨，2008年第3期；\n" +
            "    15. 《全球化时代挑战我国主流意识形态的西方思潮分析》，社会主义研究，2007年第1期；\n" +
            "    16.《主流意识形态有序管理论》，前沿，2008年第11期；\n" +
            "\n" +
            "主要奖励 \n" +
            "\n" +
            "    1、入选湖北省马克思主义中青年理论家（第二批）（2015年）； \n" +
            "    2、“毛泽东思想和中国特色社会主义理论体系概论”第九届全国多媒体课件大赛三等奖（2009年）。";
    String data25="        刘宏达，华中师范大学学生工作部部长，教授、博士生导师。2014年入选教育部首批“思想政治教育优秀中青年杰出人才支持计划”，先后被评为“全国优秀教育工作者”、“全国高校优秀思想政治教育工作者”、“全国优秀共青团干部”等。近五年，主持教育部人文社会科学研究专项任务项目等课题多项，出版专著6本，在《人大复印资料•思想政治教育》、《学校党建与思想教育》、《中国青年政治学院学报》等核心刊物发表论文10余篇。\n";



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showdata);

        backbtn= (Button) findViewById(R.id.back);
        textView= (TextView) findViewById(R.id.text);

        textView.setMovementMethod(ScrollingMovementMethod.getInstance());

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int b=getIntent().getIntExtra("id",000);
                switch (b)
                {
                    case 111:
                        Intent i111=new Intent(ShowData.this,SecondPage.class);
                        startActivity(i111);
                        finish();
                        break;
                    case 222:
                        Intent i222=new Intent(ShowData.this,SecondPagePm.class);
                        startActivity(i222);
                        finish();
                        break;
                    case 333:
                        Intent i333=new Intent(ShowData.this, SecondPage2.class);
                        startActivity(i333);
                        finish();
                        break;

                    case 444:
                        Intent i444=new Intent(ShowData.this, SecondPage2Pm.class);
                        startActivity(i444);
                        finish();
                        break;
                    case 555:
                        Intent i555 = new Intent(ShowData.this, SecondPage2Pm2.class);
                        startActivity(i555);
                        finish();
                        break;
                    case 666:
                        Intent i666=new Intent(ShowData.this, SecondPage3.class);
                        startActivity(i666);
                        finish();
                        break;
                    default:
                        break;
                }
            }
        });

        showData();
    }

    private void showData()
    {
        int a=getIntent().getIntExtra("data",0);
        switch (a)
        {
            case 2:
                textView.setText("暂无内容。");
                break;
            case 4:
                textView.setText("暂无内容。");
                break;
            case 5:
                textView.setText("暂无内容。");
                break;
            case 6:
                textView.setText("暂无内容。");
                break;
            case 7:
                textView.setText("暂无内容。");
                break;
            case 8:
                textView.setText("暂无内容。");
                break;
            case 10:
                textView.setText("暂无内容。");
                break;
            case 20:
                textView.setText("暂无内容。");
                break;
            case 30:
                textView.setText("暂无内容。");
                break;

            case 11:
                textView.setText(data11);
                break;

            case 12:
                textView.setText(data12);
                break;

            case 13:
                textView.setText(data13);
                break;
            case 14:
                textView.setText(data14);
                break;
            case 15:
                textView.setText(data15);
                break;
            case 16:
                textView.setText(data16);
                break;
            case 17:
                textView.setText(data17);
                break;
            case 18:
                textView.setText(data18);
                break;
            case 19:
                textView.setText(data19);
                break;
            case 21:
                textView.setText(data21);
                break;
            case 22:
                textView.setText(data22);
                break;
            case 23:
                textView.setText(data23);
                break;
            case 24:
                textView.setText(data24);
                break;
            case 25:
                textView.setText(data25);
                break;
            default:
                break;
        }
    }
    @Override
    public void onBackPressed()
    {
        int b1=getIntent().getIntExtra("id",000);
        switch (b1)
        {
            case 111:
                Intent i111=new Intent(ShowData.this,SecondPage.class);
                startActivity(i111);
                finish();
                break;
            case 222:
                Intent i222=new Intent(ShowData.this,SecondPagePm.class);
                startActivity(i222);
                finish();
                break;
            case 333:
                Intent i333=new Intent(ShowData.this, SecondPage2.class);
                startActivity(i333);
                finish();
                break;

            case 444:
                Intent i444=new Intent(ShowData.this, SecondPage2Pm.class);
                startActivity(i444);
                finish();
                break;
            case 555:
                Intent i555 = new Intent(ShowData.this, SecondPage2Pm2.class);
                startActivity(i555);
                finish();
                break;
            case 666:
                Intent i666=new Intent(ShowData.this, SecondPage3.class);
                startActivity(i666);
                finish();
                break;
            default:
                break;
        }
    }

}
