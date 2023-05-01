.class public final Lk1/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/load/data/d$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/data/d$a<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic b:Lo1/n$a;

.field public final synthetic c:Lk1/b0;


# direct methods
.method public constructor <init>(Lk1/b0;Lo1/n$a;)V
    .locals 0

    iput-object p1, p0, Lk1/a0;->c:Lk1/b0;

    iput-object p2, p0, Lk1/a0;->b:Lo1/n$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lk1/a0;->c:Lk1/b0;

    .line 2
    .line 3
    iget-object v1, p0, Lk1/a0;->b:Lo1/n$a;

    .line 4
    .line 5
    iget-object v2, v0, Lk1/b0;->g:Lo1/n$a;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    if-ne v2, v1, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-eqz v2, :cond_1

    .line 15
    .line 16
    iget-object v2, v0, Lk1/b0;->h:Lk1/f;

    .line 17
    .line 18
    iget-object v1, v1, Lo1/n$a;->c:Lcom/bumptech/glide/load/data/d;

    .line 19
    .line 20
    invoke-interface {v1}, Lcom/bumptech/glide/load/data/d;->e()Li1/a;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    iget-object v0, v0, Lk1/b0;->c:Lk1/h$a;

    .line 25
    .line 26
    invoke-interface {v0, v2, p1, v1, v3}, Lk1/h$a;->d(Li1/f;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/d;Li1/a;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    return-void
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lk1/a0;->c:Lk1/b0;

    .line 2
    .line 3
    iget-object v1, p0, Lk1/a0;->b:Lo1/n$a;

    .line 4
    .line 5
    iget-object v2, v0, Lk1/b0;->g:Lo1/n$a;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    if-ne v2, v1, :cond_0

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-eqz v2, :cond_2

    .line 15
    .line 16
    iget-object v2, v0, Lk1/b0;->b:Lk1/i;

    .line 17
    .line 18
    iget-object v2, v2, Lk1/i;->p:Lk1/l;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget-object v3, v1, Lo1/n$a;->c:Lcom/bumptech/glide/load/data/d;

    .line 23
    .line 24
    invoke-interface {v3}, Lcom/bumptech/glide/load/data/d;->e()Li1/a;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-virtual {v2, v3}, Lk1/l;->c(Li1/a;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    iput-object p1, v0, Lk1/b0;->f:Ljava/lang/Object;

    .line 35
    .line 36
    iget-object p1, v0, Lk1/b0;->c:Lk1/h$a;

    .line 37
    .line 38
    invoke-interface {p1}, Lk1/h$a;->a()V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    iget-object v2, v0, Lk1/b0;->c:Lk1/h$a;

    .line 43
    .line 44
    iget-object v3, v1, Lo1/n$a;->a:Li1/f;

    .line 45
    .line 46
    iget-object v4, v1, Lo1/n$a;->c:Lcom/bumptech/glide/load/data/d;

    .line 47
    .line 48
    invoke-interface {v4}, Lcom/bumptech/glide/load/data/d;->e()Li1/a;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    iget-object v6, v0, Lk1/b0;->h:Lk1/f;

    .line 53
    .line 54
    move-object v0, v2

    .line 55
    move-object v1, v3

    .line 56
    move-object v2, p1

    .line 57
    move-object v3, v4

    .line 58
    move-object v4, v5

    .line 59
    move-object v5, v6

    .line 60
    invoke-interface/range {v0 .. v5}, Lk1/h$a;->c(Li1/f;Ljava/lang/Object;Lcom/bumptech/glide/load/data/d;Li1/a;Li1/f;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    :goto_1
    return-void
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
.end method
