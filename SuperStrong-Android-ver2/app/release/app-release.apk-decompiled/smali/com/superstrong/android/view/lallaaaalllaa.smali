.class public final Lcom/superstrong/android/view/lallaaaalllaa;
.super Landroidx/appcompat/app/c;
.source "SourceFile"


# static fields
.field public static final synthetic z:I


# instance fields
.field public x:Lb4/j;

.field public y:Lz3/c;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroidx/appcompat/app/c;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/r;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    sget v0, Lz3/c;->v:I

    .line 9
    .line 10
    sget-object v0, Landroidx/databinding/c;->a:Landroidx/databinding/DataBinderMapperImpl;

    .line 11
    .line 12
    const v0, 0x7f0c0020

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0}, Landroidx/databinding/ViewDataBinding;->s(Landroid/view/LayoutInflater;I)Landroidx/databinding/ViewDataBinding;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lz3/c;

    .line 20
    .line 21
    const-string v0, "inflate(layoutInflater)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Ll4/f;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lcom/superstrong/android/view/lallaaaalllaa;->y:Lz3/c;

    .line 27
    .line 28
    iget-object p1, p1, Landroidx/databinding/ViewDataBinding;->h:Landroid/view/View;

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/c;->setContentView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    new-instance p1, Landroidx/lifecycle/i0;

    .line 34
    .line 35
    invoke-direct {p1, p0}, Landroidx/lifecycle/i0;-><init>(Landroidx/lifecycle/l0;)V

    .line 36
    .line 37
    .line 38
    const-class v0, Lb4/j;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Landroidx/lifecycle/i0;->a(Ljava/lang/Class;)Landroidx/lifecycle/f0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lb4/j;

    .line 45
    .line 46
    iput-object p1, p0, Lcom/superstrong/android/view/lallaaaalllaa;->x:Lb4/j;

    .line 47
    .line 48
    iget-object p1, p0, Lcom/superstrong/android/view/lallaaaalllaa;->y:Lz3/c;

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    const-string v1, "binding"

    .line 52
    .line 53
    if-eqz p1, :cond_4

    .line 54
    .line 55
    new-instance v2, Lcom/superstrong/android/view/lallaaaalllaa$a;

    .line 56
    .line 57
    invoke-direct {v2, p0}, Lcom/superstrong/android/view/lallaaaalllaa$a;-><init>(Lcom/superstrong/android/view/lallaaaalllaa;)V

    .line 58
    .line 59
    .line 60
    iget-object p1, p1, Lz3/c;->u:Landroid/widget/EditText;

    .line 61
    .line 62
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lcom/superstrong/android/view/lallaaaalllaa;->y:Lz3/c;

    .line 66
    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    new-instance v2, Lcom/superstrong/android/view/lallaaaalllaa$b;

    .line 70
    .line 71
    invoke-direct {v2, p0}, Lcom/superstrong/android/view/lallaaaalllaa$b;-><init>(Lcom/superstrong/android/view/lallaaaalllaa;)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p1, Lz3/c;->s:Landroid/widget/EditText;

    .line 75
    .line 76
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Lcom/superstrong/android/view/lallaaaalllaa;->y:Lz3/c;

    .line 80
    .line 81
    if-eqz p1, :cond_2

    .line 82
    .line 83
    new-instance v2, La4/e;

    .line 84
    .line 85
    const/16 v3, 0xa

    .line 86
    .line 87
    invoke-direct {v2, v3, p0}, La4/e;-><init>(ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object p1, p1, Lz3/c;->r:Landroid/widget/Button;

    .line 91
    .line 92
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lcom/superstrong/android/view/lallaaaalllaa;->y:Lz3/c;

    .line 96
    .line 97
    if-eqz p1, :cond_1

    .line 98
    .line 99
    new-instance v2, Lm3/c;

    .line 100
    .line 101
    const/16 v3, 0xd

    .line 102
    .line 103
    invoke-direct {v2, v3, p0}, Lm3/c;-><init>(ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object p1, p1, Lz3/c;->t:Landroid/widget/Button;

    .line 107
    .line 108
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 109
    .line 110
    .line 111
    iget-object p1, p0, Lcom/superstrong/android/view/lallaaaalllaa;->y:Lz3/c;

    .line 112
    .line 113
    if-eqz p1, :cond_0

    .line 114
    .line 115
    new-instance v0, Lf3/a;

    .line 116
    .line 117
    const/16 v1, 0x9

    .line 118
    .line 119
    invoke-direct {v0, v1, p0}, Lf3/a;-><init>(ILjava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    iget-object p1, p1, Lz3/c;->q:Landroid/widget/Button;

    .line 123
    .line 124
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_0
    invoke-static {v1}, Ll4/f;->k(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw v0

    .line 132
    :cond_1
    invoke-static {v1}, Ll4/f;->k(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw v0

    .line 136
    :cond_2
    invoke-static {v1}, Ll4/f;->k(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v0

    .line 140
    :cond_3
    invoke-static {v1}, Ll4/f;->k(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw v0

    .line 144
    :cond_4
    invoke-static {v1}, Ll4/f;->k(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v0
    .line 148
    .line 149
    .line 150
.end method
