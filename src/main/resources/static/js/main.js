// 通用功能：显示问答答案
function showAnswer(id) {
    const answer = document.getElementById(id);
    answer.classList.toggle('hidden');
}

// 页面加载完成后执行
document.addEventListener('DOMContentLoaded', function() {
    // 产品服务页标签切换
    const tabBtns = document.querySelectorAll('.tab-btn');
    tabBtns.forEach(btn => {
        btn.addEventListener('click', function() {
            const tab = this.getAttribute('data-tab');
            tabBtns.forEach(b => b.classList.remove('active'));
            this.classList.add('active');
            document.querySelectorAll('.tab-content').forEach(content => content.classList.remove('active'));
            document.getElementById(`${tab}-tab`).classList.add('active');
        });
    });

    // 预约表单提交
    const reserveForm = document.querySelector('.reserve-form');
    if (reserveForm) {
        reserveForm.addEventListener('submit', function(e) {
            e.preventDefault();
            alert('预约提交成功！我们将尽快与您联系~');
            this.reset();
        });
    }

    // 卡通伙伴问答提交
    const quizSubmit = document.querySelector('.quiz-submit');
    if (quizSubmit) {
        quizSubmit.addEventListener('click', function() {
            const selected = document.querySelector('input[name="quiz"]:checked');
            if (!selected) {
                alert('请选择一个答案！');
                return;
            }
            const result = document.getElementById('quiz-result');
            result.classList.remove('hidden');
            if (selected.value === 'queque') {
                result.style.color = '#28a745';
            } else {
                result.style.color = '#dc3545';
            }
        });
    }

    // 图片懒加载
    const lazyImages = document.querySelectorAll('img[loading="lazy"]');
    if ('IntersectionObserver' in window) {
        const imageObserver = new IntersectionObserver((entries, observer) => {
            entries.forEach(entry => {
                if (entry.isIntersecting) {
                    const image = entry.target;
                    image.src = image.dataset.src;
                    imageObserver.unobserve(image);
                }
            });
        });
        lazyImages.forEach(image => imageObserver.observe(image));
    }
});