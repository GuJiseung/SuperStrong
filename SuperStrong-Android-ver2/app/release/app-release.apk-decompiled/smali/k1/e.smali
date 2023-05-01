.class public final Lk1/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk1/h;
.implements Lcom/bumptech/glide/load/data/d$a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lk1/h;",
        "Lcom/bumptech/glide/load/data/d$a<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li1/f;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lk1/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lk1/i<",
            "*>;"
        }
    .end annotation
.end field

.field public final d:Lk1/h$a;

.field public e:I

.field public f:Li1/f;

.field public g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo1/n<",
            "Ljava/io/File;",
            "*>;>;"
        }
    .end annotation
.end field

.field public h:I

.field public volatile i:Lo1/n$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo1/n$a<",
            "*>;"
        }
    .end annotation
.end field

.field public j:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/util/List;Lk1/i;Lk1/h$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Li1/f;",
            ">;",
            "Lk1/i<",
            "*>;",
            "Lk1/h$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lk1/e;->e:I

    iput-object p1, p0, Lk1/e;->b:Ljava/util/List;

    iput-object p2, p0, Lk1/e;->c:Lk1/i;

    iput-object p3, p0, Lk1/e;->d:Lk1/h$a;

    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 8

    .line 1
    :cond_0
    :goto_0
    iget-object v0, p0, Lk1/e;->g:Ljava/util/List;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    iget v3, p0, Lk1/e;->h:I

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-ge v3, v0, :cond_1

    .line 14
    .line 15
    move v0, v2

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    move v0, v1

    .line 18
    :goto_1
    if-nez v0, :cond_2

    .line 19
    .line 20
    goto :goto_5

    .line 21
    :cond_2
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lk1/e;->i:Lo1/n$a;

    .line 23
    .line 24
    move v0, v1

    .line 25
    :cond_3
    :goto_2
    if-nez v0, :cond_6

    .line 26
    .line 27
    iget v3, p0, Lk1/e;->h:I

    .line 28
    .line 29
    iget-object v4, p0, Lk1/e;->g:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-ge v3, v4, :cond_4

    .line 36
    .line 37
    move v3, v2

    .line 38
    goto :goto_3

    .line 39
    :cond_4
    move v3, v1

    .line 40
    :goto_3
    if-eqz v3, :cond_6

    .line 41
    .line 42
    iget-object v3, p0, Lk1/e;->g:Ljava/util/List;

    .line 43
    .line 44
    iget v4, p0, Lk1/e;->h:I

    .line 45
    .line 46
    add-int/lit8 v5, v4, 0x1

    .line 47
    .line 48
    iput v5, p0, Lk1/e;->h:I

    .line 49
    .line 50
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    check-cast v3, Lo1/n;

    .line 55
    .line 56
    iget-object v4, p0, Lk1/e;->j:Ljava/io/File;

    .line 57
    .line 58
    iget-object v5, p0, Lk1/e;->c:Lk1/i;

    .line 59
    .line 60
    iget v6, v5, Lk1/i;->e:I

    .line 61
    .line 62
    iget v7, v5, Lk1/i;->f:I

    .line 63
    .line 64
    iget-object v5, v5, Lk1/i;->i:Li1/h;

    .line 65
    .line 66
    invoke-interface {v3, v4, v6, v7, v5}, Lo1/n;->a(Ljava/lang/Object;IILi1/h;)Lo1/n$a;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    iput-object v3, p0, Lk1/e;->i:Lo1/n$a;

    .line 71
    .line 72
    iget-object v3, p0, Lk1/e;->i:Lo1/n$a;

    .line 73
    .line 74
    if-eqz v3, :cond_3

    .line 75
    .line 76
    iget-object v3, p0, Lk1/e;->c:Lk1/i;

    .line 77
    .line 78
    iget-object v4, p0, Lk1/e;->i:Lo1/n$a;

    .line 79
    .line 80
    iget-object v4, v4, Lo1/n$a;->c:Lcom/bumptech/glide/load/data/d;

    .line 81
    .line 82
    invoke-interface {v4}, Lcom/bumptech/glide/load/data/d;->a()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    invoke-virtual {v3, v4}, Lk1/i;->c(Ljava/lang/Class;)Lk1/u;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    if-eqz v3, :cond_5

    .line 91
    .line 92
    move v3, v2

    .line 93
    goto :goto_4

    .line 94
    :cond_5
    move v3, v1

    .line 95
    :goto_4
    if-eqz v3, :cond_3

    .line 96
    .line 97
    iget-object v0, p0, Lk1/e;->i:Lo1/n$a;

    .line 98
    .line 99
    iget-object v0, v0, Lo1/n$a;->c:Lcom/bumptech/glide/load/data/d;

    .line 100
    .line 101
    iget-object v3, p0, Lk1/e;->c:Lk1/i;

    .line 102
    .line 103
    iget-object v3, v3, Lk1/i;->o:Lcom/bumptech/glide/i;

    .line 104
    .line 105
    invoke-interface {v0, v3, p0}, Lcom/bumptech/glide/load/data/d;->f(Lcom/bumptech/glide/i;Lcom/bumptech/glide/load/data/d$a;)V

    .line 106
    .line 107
    .line 108
    move v0, v2

    .line 109
    goto :goto_2

    .line 110
    :cond_6
    return v0

    .line 111
    :cond_7
    :goto_5
    iget v0, p0, Lk1/e;->e:I

    .line 112
    .line 113
    add-int/2addr v0, v2

    .line 114
    iput v0, p0, Lk1/e;->e:I

    .line 115
    .line 116
    iget-object v2, p0, Lk1/e;->b:Ljava/util/List;

    .line 117
    .line 118
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    if-lt v0, v2, :cond_8

    .line 123
    .line 124
    return v1

    .line 125
    :cond_8
    iget-object v0, p0, Lk1/e;->b:Ljava/util/List;

    .line 126
    .line 127
    iget v2, p0, Lk1/e;->e:I

    .line 128
    .line 129
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, Li1/f;

    .line 134
    .line 135
    new-instance v2, Lk1/f;

    .line 136
    .line 137
    iget-object v3, p0, Lk1/e;->c:Lk1/i;

    .line 138
    .line 139
    iget-object v4, v3, Lk1/i;->n:Li1/f;

    .line 140
    .line 141
    invoke-direct {v2, v0, v4}, Lk1/f;-><init>(Li1/f;Li1/f;)V

    .line 142
    .line 143
    .line 144
    iget-object v3, v3, Lk1/i;->h:Lk1/j$d;

    .line 145
    .line 146
    check-cast v3, Lk1/m$c;

    .line 147
    .line 148
    invoke-virtual {v3}, Lk1/m$c;->a()Lm1/a;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-interface {v3, v2}, Lm1/a;->a(Li1/f;)Ljava/io/File;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    iput-object v2, p0, Lk1/e;->j:Ljava/io/File;

    .line 157
    .line 158
    if-eqz v2, :cond_0

    .line 159
    .line 160
    iput-object v0, p0, Lk1/e;->f:Li1/f;

    .line 161
    .line 162
    iget-object v0, p0, Lk1/e;->c:Lk1/i;

    .line 163
    .line 164
    iget-object v0, v0, Lk1/i;->c:Lcom/bumptech/glide/g;

    .line 165
    .line 166
    iget-object v0, v0, Lcom/bumptech/glide/g;->b:Lcom/bumptech/glide/j;

    .line 167
    .line 168
    invoke-virtual {v0, v2}, Lcom/bumptech/glide/j;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    iput-object v0, p0, Lk1/e;->g:Ljava/util/List;

    .line 173
    .line 174
    iput v1, p0, Lk1/e;->h:I

    .line 175
    .line 176
    goto/16 :goto_0
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
.end method

.method public final c(Ljava/lang/Exception;)V
    .locals 4

    iget-object v0, p0, Lk1/e;->d:Lk1/h$a;

    iget-object v1, p0, Lk1/e;->f:Li1/f;

    iget-object v2, p0, Lk1/e;->i:Lo1/n$a;

    iget-object v2, v2, Lo1/n$a;->c:Lcom/bumptech/glide/load/data/d;

    sget-object v3, Li1/a;->d:Li1/a;

    invoke-interface {v0, v1, p1, v2, v3}, Lk1/h$a;->d(Li1/f;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/d;Li1/a;)V

    return-void
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lk1/e;->i:Lo1/n$a;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lo1/n$a;->c:Lcom/bumptech/glide/load/data/d;

    invoke-interface {v0}, Lcom/bumptech/glide/load/data/d;->cancel()V

    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lk1/e;->d:Lk1/h$a;

    iget-object v1, p0, Lk1/e;->f:Li1/f;

    iget-object v2, p0, Lk1/e;->i:Lo1/n$a;

    iget-object v3, v2, Lo1/n$a;->c:Lcom/bumptech/glide/load/data/d;

    sget-object v4, Li1/a;->d:Li1/a;

    iget-object v5, p0, Lk1/e;->f:Li1/f;

    move-object v2, p1

    invoke-interface/range {v0 .. v5}, Lk1/h$a;->c(Li1/f;Ljava/lang/Object;Lcom/bumptech/glide/load/data/d;Li1/a;Li1/f;)V

    return-void
.end method
